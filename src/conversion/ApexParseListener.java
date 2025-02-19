package conversion;

import antlrapex.apexBaseListener;
import antlrapex.apexParser.*;
import apex.Parsing;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

import ts.Creator;
import ts.types.ClassDeclaration;

public class ApexParseListener extends apexBaseListener {
    private final Creator _tsTypeCreator;
    private final ParseTree _tree;

//    private final Map<String, List<String>> methodAnnotations = new HashMap<>();

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

//    @Override
//    public void enterClassBodyDeclaration(ClassBodyDeclarationContext ctx) {
//        // Collect annotations
//        List<String> annotations = new ArrayList<>();
//        for (AnnotationContext annotation : ctx.annotation()) {
//            annotations.add(annotation.getText());
//        }
//
//        // Check for method declarations
//        if (ctx.memberDeclaration().methodDeclaration() != null && !annotations.isEmpty()) {
//            MethodDeclarationContext methodCtx = ctx.memberDeclaration().methodDeclaration();
//            this.methodAnnotations.put(methodCtx.Identifier().getText(), annotations);
//        }
//    }

    @Override
    public void enterClassDeclaration(ClassDeclarationContext ctx) {
        // Convert Apex class to TypeScript class
        ClassDeclaration classDeclaration = new ClassDeclaration(ctx.Identifier().getText());
        this._tsTypeCreator.beginClass(classDeclaration);
    }

    @Override
    public void exitClassDeclaration(ClassDeclarationContext ctx) {
        this._tsTypeCreator.endClass();
    }

    @Override
    public void enterFieldDeclaration(FieldDeclarationContext fieldCtx) {
        this._tsTypeCreator.fieldDeclaration(fieldCtx);
    }

    @Override
    public void exitFieldDeclaration(FieldDeclarationContext fieldCtx) {
        this._tsTypeCreator.endFieldDeclaration();
    }
}
