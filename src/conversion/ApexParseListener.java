package conversion;

import antlrapex.apexBaseListener;
import antlrapex.apexParser.*;
import apex.Parsing;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

import ts.Creator;

public class ApexParseListener extends apexBaseListener {
    private final Creator _tsTypeCreator;
    private final ParseTree _tree;
    private Boolean _isAuraEnabled = false;

    public ApexParseListener(
            String fileName,
            String filePath,
            Creator tsTypeCreator
    ) throws IOException {
        this._tsTypeCreator = tsTypeCreator;

        // Parse the input and get the AST
        this._tree = Parsing.getTree(filePath + fileName);
    }

    public void convert() throws IOException {
        // Traverse the AST using a listener or visitor
        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(this, this._tree);
        this._tsTypeCreator.close();
    }

    @Override
    public void enterClassDeclaration(ClassDeclarationContext ctx) {
        this._tsTypeCreator.beginClass(ctx);
    }

    @Override
    public void exitClassDeclaration(ClassDeclarationContext ctx) {
        this._tsTypeCreator.endClass();
    }

    @Override
    public void enterFieldDeclaration(FieldDeclarationContext fieldCtx) {
        if (this._isAuraEnabled) {
            this._tsTypeCreator.fieldDeclaration(fieldCtx);
        }
    }

    @Override
    public void exitFieldDeclaration(FieldDeclarationContext fieldCtx) {
        if (this._isAuraEnabled) {
            this._tsTypeCreator.endFieldDeclaration();
            this._isAuraEnabled = false;
        }
    }

    @Override
    public void enterPropertyDeclaration(PropertyDeclarationContext propertyCtx) {
        if (this._isAuraEnabled) {
            this._tsTypeCreator.propertyDeclaration(propertyCtx);
        }
    }

    @Override
    public void exitPropertyDeclaration(PropertyDeclarationContext propertyCtx) {
        if (this._isAuraEnabled) {
            this._tsTypeCreator.endFieldDeclaration();
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
}
