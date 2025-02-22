package conversion.writers;

import antlrapex.apexParser.ClassOrInterfaceTypeContext;
import antlrapex.apexParser.VariableDeclaratorsContext;
import antlrapex.apexParser.VariableDeclaratorContext;
import conversion.type.ClassOrInterfaceTypeFactory;
import conversion.type.ITypeConvertUtil;
import conversion.type.TypeUtils;
import conversion.Writer;
import typeresolution.ResolvedTypeInfo;

public class ClassOrInterfaceWriter {
    private String currentIdentifier;
    private final Writer _tsTypeWriter;
    private final TypeUtils _typeUtils;
    private final ITypeConvertUtil _typeConvertUtil;

    public ClassOrInterfaceWriter(
            Writer tsTypeCreator,
            TypeUtils typeUtils,
            ITypeConvertUtil typeConvertUtil
    ) {
        this._tsTypeWriter = tsTypeCreator;
        this._typeConvertUtil = typeConvertUtil;
        this._typeUtils = typeUtils;
    }

    public void process(
            ClassOrInterfaceTypeContext classOrInterfaceType,
            VariableDeclaratorsContext variableDeclarators
    ) {
        this.currentIdentifier = this.processVariableDeclarators(variableDeclarators);
        this._tsTypeWriter.beginLine(this.currentIdentifier + ": ");
        ResolvedTypeInfo resolvedType = this._typeConvertUtil.convertType(classOrInterfaceType.Identifier());

        ClassOrInterfaceTypeFactory.getConversionWriter(
                resolvedType.symbol,
                this._tsTypeWriter,
                this._typeUtils,
                this._typeConvertUtil
        ).iterateArguments(classOrInterfaceType, resolvedType.symbol);
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
}
