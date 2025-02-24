package org.gallaghercodedesign.apextsstubgenerator.listeners;

import org.gallaghercodedesign.apextsstubgenerator.antlrapex.apexBaseListener;
import org.gallaghercodedesign.apextsstubgenerator.antlrapex.apexParser.*;
import org.gallaghercodedesign.apextsstubgenerator.tsgeneration.ClassOrInterfaceBuilder;
import org.gallaghercodedesign.apextsstubgenerator.tsgeneration.TsFileWriter;
import org.gallaghercodedesign.apextsstubgenerator.tsgeneration.type.TypeConverterFactory;
import org.gallaghercodedesign.apextsstubgenerator.tsgeneration.type.TypeUtils;
import org.gallaghercodedesign.apextsstubgenerator.parsing.ParseUtils;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.gallaghercodedesign.apextsstubgenerator.tsgeneration.writers.ApiMethodBuilder;
import org.gallaghercodedesign.apextsstubgenerator.tsgeneration.writers.VariableTypeBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApexParseListener extends apexBaseListener {
    private final ParseTree _tree;
    private final ApexListenerContext _context = new ApexListenerContext();
    private final List<ClassOrInterfaceBuilder> _classOrInterfaceBuilders = new ArrayList<>();
    private final List<ApiMethodBuilder> _apiMethodBuilders = new ArrayList<>();
    private final TypeUtils _typeUtils;
    private final FileWriter _fileWriter;
    private final TypeConverterFactory _typeConverterFactory;
    private final VariableTypeBuilder _variableTypeBuilder;
    private Boolean _isAuraEnabled = false;

    public ApexParseListener(
            String apexFilePath,
            FileWriter fileWriter,
            TypeUtils typeUtils,
            TypeConverterFactory typeConverterFactory,
            VariableTypeBuilder variableTypeBuilder

    ) throws IOException {
        // Parse the input and get the AST
        this._tree = ParseUtils.getTree(apexFilePath);
        this._typeUtils = typeUtils;
        // this writer will be used to write the TypeScript code to the output file
        this._fileWriter = fileWriter;
        this._typeConverterFactory = typeConverterFactory;
        this._variableTypeBuilder = variableTypeBuilder;
    }

    public void convert() throws IOException {
        // Traverse the AST using a listener or visitor
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(this, this._tree);
        this._fileWriter.close();
    }

    @Override
    public void enterClassDeclaration(ClassDeclarationContext ctx) {
        this._context.currentTypeLevel++;
        this._context.currentInterfaceWriter = new TsFileWriter(this._fileWriter);
        String className = ctx.Identifier().getText();
        this._classOrInterfaceBuilders.add(new ClassOrInterfaceBuilder(
                this._typeUtils,
                this._context.currentInterfaceWriter, // re-use the same file writer for classes
                this._variableTypeBuilder
        ));

        this._apiMethodBuilders.add(new ApiMethodBuilder(
                className,
                this._variableTypeBuilder,
                new TsFileWriter(this._fileWriter)
        ));

        this.getCurrentClassBuilder().beginClass(className);
    }

    @Override
    public void exitClassDeclaration(ClassDeclarationContext ctx) {
        this.getCurrentClassBuilder().endClass();

        String importText = this._typeConverterFactory.getTypeConverter("ClassOrInterfaceType").flushImports();

        if (importText != null && !importText.isEmpty()) {
            // write current class imports for external type references to current file
            try {
                this._fileWriter.write(importText + "\n");
            } catch (IOException e) {
                throw new RuntimeException("Failed to write to TypeScript file");
            }
        }

        if (this._context.currentTypeLevel == 0) {
            this.flushApiMethods();
            this.flushClassBodies();
            this.removeClassBuilders();
        }

        this._context.currentTypeLevel--;
    }

    @Override
    public void enterFieldDeclaration(FieldDeclarationContext fieldCtx) {
        if (this._isAuraEnabled) {
            this.getCurrentClassBuilder().fieldDeclaration(fieldCtx.type_(), fieldCtx.variableDeclarators());
        }
    }

    @Override
    public void exitFieldDeclaration(FieldDeclarationContext fieldCtx) {
        if (this._isAuraEnabled) {
            this.getCurrentClassBuilder().endFieldDeclaration();
            this._isAuraEnabled = false;
        }
    }

    @Override
    public void enterPropertyDeclaration(PropertyDeclarationContext propertyCtx) {
        if (this._isAuraEnabled) {
            this.getCurrentClassBuilder().fieldDeclaration(propertyCtx.type_(), propertyCtx.variableDeclarators());
        }
    }

    @Override
    public void exitPropertyDeclaration(PropertyDeclarationContext propertyCtx) {
        if (this._isAuraEnabled) {
            this.getCurrentClassBuilder().endFieldDeclaration();
            this._isAuraEnabled = false;
        }
    }

    @Override
    public void enterAnnotation(AnnotationContext annotationCtx) {
        if (annotationCtx.getText().contains("AuraEnabled")) {
            this._isAuraEnabled = true;
        }
    }

    @Override
    public void exitStatement(StatementContext statementCtx) {
        if (this._isAuraEnabled) {
            this._isAuraEnabled = false;
        }
    }

    @Override
    public void enterMethodDeclaration(MethodDeclarationContext ctx) {
        if (this._isAuraEnabled) {
            this.getCurrentApiMethodBuilder().methodDeclaration(ctx.type_(), ctx.formalParameters(), ctx.Identifier().getText());
        }
    }

    private void flushApiMethods() {
        for (ApiMethodBuilder apiMethodBuilder : this._apiMethodBuilders) {
            TsFileWriter writer = apiMethodBuilder.getWriter();
            if (writer.isEmpty()) {
                continue;
            }

            writer.appendCode("\n");
            writer.flush();
        }
    }

    private void flushClassBodies() {
        for (ClassOrInterfaceBuilder classBuilder : this._classOrInterfaceBuilders) {
            TsFileWriter writer = classBuilder.getWriter();
            writer.appendCode("\n");
            writer.flush();
        }
    }

    private ClassOrInterfaceBuilder getCurrentClassBuilder() {
        return this._classOrInterfaceBuilders.get(this._context.currentTypeLevel);
    }

    private ApiMethodBuilder getCurrentApiMethodBuilder() {
        return this._apiMethodBuilders.get(this._context.currentTypeLevel);
    }

    private void removeClassBuilders() {
        this._classOrInterfaceBuilders.clear();
    }
}
