package apextsstubgenerator.listeners;

import apextsstubgenerator.antlrapex.apexBaseListener;
import apextsstubgenerator.antlrapex.apexParser.*;
import apextsstubgenerator.tsgeneration.ClassOrInterfaceBuilder;
import apextsstubgenerator.tsgeneration.TsFileWriter;
import apextsstubgenerator.tsgeneration.type.TypeConverterFactory;
import apextsstubgenerator.tsgeneration.type.TypeUtils;
import apextsstubgenerator.parsing.ParseUtils;
import apextsstubgenerator.utils.FileUtils;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import apextsstubgenerator.tsgeneration.writers.ApiMethodBuilder;
import apextsstubgenerator.tsgeneration.writers.VariableTypeBuilder;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ApexParseListener extends apexBaseListener {
    public final List<Path> _filesCreated = new ArrayList<>();
    public final Path _currentApexFile;
    public final String _outputFolder;
    private final ParseTree _tree;
    private final ApexListenerContext _context = new ApexListenerContext();
    private final List<ClassOrInterfaceBuilder> _classOrInterfaceBuilders = new ArrayList<>();
    private final List<ApiMethodBuilder> _apiMethodBuilders = new ArrayList<>();
    private final TypeUtils _typeUtils;
    private final TypeConverterFactory _typeConverterFactory;
    private final VariableTypeBuilder _variableTypeBuilder;
    private Boolean _isAuraEnabled = false;

    public ApexParseListener(
            ApexParseListenerInput parserInput

    ) throws IOException {
        // Parse the input and get the AST
        this._outputFolder = parserInput.getOutputFolder().toString();
        this._currentApexFile = parserInput.getInputPath();
        this._tree = ParseUtils.getTree(parserInput.getInputPath().toAbsolutePath().toString());
        this._typeUtils = parserInput.getTypeUtils();
        this._typeConverterFactory = parserInput.getTypeConverterFactory();
        this._variableTypeBuilder = parserInput.getVariableTypeBuilder();
    }

    public List<Path> convert() throws IOException {
        // Traverse the AST using a listener or visitor
        ParseTreeWalker walker = new ParseTreeWalker();
        try {
            walker.walk(this, this._tree);
        } catch (Exception e) {
            throw new RuntimeException("Failed to walk the parse tree");
        }

        //return files created
        return this._filesCreated;
    }

    @Override
    public void enterClassDeclaration(ClassDeclarationContext ctx) {
        this._context.currentTypeLevel++;
        this._context.currentInterfaceWriter = new TsFileWriter();

        String className;
        if (ctx.GET() != null) {
            className = ctx.GET().getText();
        } else {
            className = ctx.Identifier().getText();
        }

        this._classOrInterfaceBuilders.add(new ClassOrInterfaceBuilder(
                this._typeUtils,
                this._context.currentInterfaceWriter, // re-use the same file writer for classes
                this._variableTypeBuilder
        ));

        this._apiMethodBuilders.add(new ApiMethodBuilder(
                className,
                this._variableTypeBuilder,
                new TsFileWriter()
        ));

        this.getCurrentClassBuilder().beginClass(className);
    }

    @Override
    public void exitClassDeclaration(ClassDeclarationContext ctx) {
        if (this._context.currentTypeLevel == 0) {
            String importText = this._typeConverterFactory.getTypeConverter("ClassOrInterfaceType").flushImports();
            this.writeFileContents(
                    this._currentApexFile,
                    Paths.get(this._outputFolder, "types"),
                    importText
            );
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
        String methodName;

        if (ctx.GET() != null) {
            methodName = ctx.GET().getText();
        } else {
            methodName = ctx.Identifier().getText();
        }

        if (this._isAuraEnabled) {
            this.getCurrentApiMethodBuilder().methodDeclaration(ctx.type_(), ctx.formalParameters(), methodName);
        }
    }

    private void writeFileContents(Path currentApexFile, Path outputFolder, String importsText) {
        if (this.classOrApiMethodHasContents()) {
            String outputFileName = FileUtils.removeExtension(currentApexFile.getFileName().toString()) + ".ts";
            Path outputTsFilePath = Paths.get(outputFolder.toString(), outputFileName);
            FileUtils.ensureDirectoryExists(outputFolder.toString());

            // Append StringBuilder content to file
            try (BufferedWriter writer = new BufferedWriter(
                    new FileWriter(
                            outputTsFilePath.toString(),
                            true
                    ))
            ) {
                writer.write(importsText + "\n");
                this.flushApiMethods(writer);
                this.flushClassBodies(writer);
            } catch (IOException e) {
                throw new RuntimeException("Failed to write to TypeScript file " + e.getMessage());
            } finally {
                this._filesCreated.add(outputTsFilePath);
            }
        }
    }

    private Boolean classOrApiMethodHasContents() {
        for (ApiMethodBuilder apiMethodBuilder : this._apiMethodBuilders) {
            if(apiMethodBuilder.hasContents()) {
                return true;
            }
        }

        for (ClassOrInterfaceBuilder classBuilder : this._classOrInterfaceBuilders) {
            if(classBuilder.hasContents()) {
                return true;
            }
        }

        return false;
    }

    private void flushApiMethods(BufferedWriter writer) throws IOException {
        for (ApiMethodBuilder apiMethodBuilder : this._apiMethodBuilders) {
            writer.write(apiMethodBuilder.emptyContents());
        }
    }

    private void flushClassBodies(BufferedWriter writer) throws IOException {
        for (ClassOrInterfaceBuilder classBuilder : this._classOrInterfaceBuilders) {
            writer.write(classBuilder.emptyContents());
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
