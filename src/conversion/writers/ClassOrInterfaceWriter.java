package conversion.writers;

import antlrapex.apexParser.ClassOrInterfaceTypeContext;
import antlrapex.apexParser.VariableDeclaratorsContext;
import antlrapex.apexParser.VariableDeclaratorContext;
import conversion.type.ClassOrInterfaceTypeFactory;
import conversion.type.TypeUtils;
import conversion.Writer;

public class ClassOrInterfaceWriter {
    private String currentIdentifier;
    private final Writer _tsTypeWriter;
    private final TypeUtils _typeUtils;

    public ClassOrInterfaceWriter(
            TypeUtils typeUtils,
            Writer tsTypeCreator
    ) {
        this._tsTypeWriter = tsTypeCreator;
        this._typeUtils = typeUtils;
    }

    public void process(
            ClassOrInterfaceTypeContext classOrInterfaceType,
            VariableDeclaratorsContext variableDeclarators
    ) {
        this.currentIdentifier = this.processVariableDeclarators(variableDeclarators);
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
