package tsgeneration;

import antlrapex.apexParser.Type_Context;
import antlrapex.apexParser.VariableDeclaratorsContext;
import tsgeneration.type.TypeUtils;
import tsgeneration.writers.VariableTypeBuilder;

public class ClassOrInterfaceBuilder {
    private final TypeUtils _typeUtils;
    private final TsFileWriter _writer;
    private final VariableTypeBuilder _variableTypeBuilder;

    public ClassOrInterfaceBuilder(
            TypeUtils typeUtils,
            TsFileWriter tsWriter,
            VariableTypeBuilder variableTypeBuilder
    ) {
        this._typeUtils = typeUtils;
        this._writer = tsWriter;
        this._variableTypeBuilder = variableTypeBuilder;
    }

    public void fieldDeclaration(
            Type_Context fieldType,
            VariableDeclaratorsContext variableDeclarators
    ) {
        this.beginFieldDeclaration(variableDeclarators);
        String convertedVariableType = this._variableTypeBuilder.convertType(fieldType);
        this._writer.appendCode(convertedVariableType);
    }

    private void beginFieldDeclaration(VariableDeclaratorsContext variableDeclarators) {
        String currentIdentifier = this._typeUtils.processVariableDeclarators(variableDeclarators);
        this._writer.beginCode(currentIdentifier).append(": ");
    }

    public void endFieldDeclaration() {
        this._writer.appendCode(";");
    }

    public void beginClass(String className) {
        this._writer.appendCode("export interface " + className+ " {");
        this._writer.incrementIndentation();
    }

    public void endClass() {
        this._writer.decrementIndentation();
        this._writer.beginCode("}");
    }

    public TsFileWriter getWriter() {
        return this._writer;
    }
}
