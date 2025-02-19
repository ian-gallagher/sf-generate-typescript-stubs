package conversion;

import antlrapex.apexParser.ClassOrInterfaceTypeContext;
import antlrapex.apexParser.FieldDeclarationContext;
import antlrapex.apexParser.VariableDeclaratorsContext;
import antlrapex.apexParser.VariableDeclaratorContext;
import ts.Writer;

public class ClassOrInterface {
    private String currentIdentifier;
    private final Writer _tsTypeWriter;
    private final TypeUtils _typeUtils;

    public ClassOrInterface(
            TypeUtils typeUtils,
            Writer tsTypeCreator
    ) {
        this._tsTypeWriter = tsTypeCreator;
        this._typeUtils = typeUtils;
    }

    public void process(FieldDeclarationContext fieldCtx) {
        ClassOrInterfaceTypeContext classOrInterfaceType = fieldCtx.type_().classOrInterfaceType();
        this.currentIdentifier = this.processVariableDeclarators(fieldCtx.variableDeclarators());
        this.beginTypePart(this.currentIdentifier + ": ");
        String contextType = this._typeUtils.processTypeIdentifier(classOrInterfaceType.Identifier());

        ClassOrInterfaceTypeFactory.getConversionWriter(
                contextType,
                this._typeUtils
        ).iterateArguments(classOrInterfaceType, contextType);
    }

    /**
     * Iterates over variable declarators and begins the type part. This is the variable name.
     * @param variableDeclarators variableDeclarators context list
     */
    private String processVariableDeclarators(VariableDeclaratorsContext variableDeclarators) {
        int variableDeclaratorCount = variableDeclarators.variableDeclarator().size();

        StringBuilder strBuilder = new StringBuilder();

        for (int i = 0; i < variableDeclaratorCount; i++) {
            VariableDeclaratorContext variableDeclarator = variableDeclarators.variableDeclarator(i);
            if (strBuilder.isEmpty()) {
                strBuilder.append(variableDeclarator.variableDeclaratorId().getText());
            } else {
                strBuilder.append(variableDeclarator.variableDeclaratorId().getText());
            }
        }

        this.currentIdentifier = strBuilder.toString();
        return strBuilder.toString();
    }

    private void beginTypePart(String typePart) {
        this._tsTypeWriter.beginLine(typePart);
    }
}
