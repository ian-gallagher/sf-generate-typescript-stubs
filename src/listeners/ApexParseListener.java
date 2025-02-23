package listeners;

import antlrapex.apexBaseListener;
import antlrapex.apexParser.*;
import tsgeneration.ClassOrInterfaceBuilder;
import tsgeneration.InterfaceWriter;
import tsgeneration.type.TypeConverterFactory;
import tsgeneration.type.TypeUtils;
import parsing.ParseUtils;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ApexParseListener extends apexBaseListener {
    private final ParseTree _tree;
    private final ApexListenerContext _context = new ApexListenerContext();
    private final List<ClassOrInterfaceBuilder> _classOrInterfaceBuilders = new ArrayList<>();
    private final TypeUtils _typeUtils;
    private final FileWriter _fileWriter;
    private final TypeConverterFactory _typeConverterFactory;
    private Boolean _isAuraEnabled = false;

    public ApexParseListener(
            String apexFilePath,
            FileWriter fileWriter,
            TypeUtils typeUtils,
            TypeConverterFactory typeConverterFactory

    ) throws IOException {
        // Parse the input and get the AST
        this._tree = ParseUtils.getTree(apexFilePath);
        this._typeUtils = typeUtils;
        // this writer will be used to write the TypeScript code to the output file
        this._fileWriter = fileWriter;
        this._typeConverterFactory = typeConverterFactory;
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
        this._classOrInterfaceBuilders.add(new ClassOrInterfaceBuilder(
                this._typeUtils,
                new InterfaceWriter(this._fileWriter), // re-use the same file writer for classes
                this._typeConverterFactory
        ));

        this.getCurrentClassBuilder().beginClass(ctx);
    }

    @Override
    public void exitClassDeclaration(ClassDeclarationContext ctx) {
        this.getCurrentClassBuilder().endClass();

        String importText = this.getCurrentClassBuilder().getImports();

        if (importText != null && !importText.isEmpty()) {
            // write current class imports for external type references to current file
            try {
                this._fileWriter.write(importText + "\n");
            } catch (IOException e) {
                throw new RuntimeException("Failed to write to TypeScript file");
            }
        }

        if (this._context.currentTypeLevel == 0) {
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

    private void flushClassBodies() {
        for (ClassOrInterfaceBuilder classBuilder : this._classOrInterfaceBuilders) {
            classBuilder.flushBody();
        }
    }

    private ClassOrInterfaceBuilder getCurrentClassBuilder() {
        return this._classOrInterfaceBuilders.get(this._context.currentTypeLevel);
    }

    private void removeClassBuilders() {
        this._classOrInterfaceBuilders.clear();
    }
}
