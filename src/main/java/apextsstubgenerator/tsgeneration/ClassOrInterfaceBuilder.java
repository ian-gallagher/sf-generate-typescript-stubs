package apextsstubgenerator.tsgeneration;

import apextsstubgenerator.antlrapex.apexParser.Type_Context;
import apextsstubgenerator.antlrapex.apexParser.VariableDeclaratorsContext;
import apextsstubgenerator.tsgeneration.type.TypeUtils;
import apextsstubgenerator.tsgeneration.writers.VariableTypeBuilder;

public class ClassOrInterfaceBuilder {
    private final TypeUtils _typeUtils;
    private final TsFileWriter _writer;
    private final VariableTypeBuilder _variableTypeBuilder;
    private Boolean _hasMembers = false;

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
        this._hasMembers = true;
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

    public String emptyContents() {
        if (this.hasContents()) {
            this._writer.decrementIndentation();
            this._writer.beginCode("}");
            return this._writer.empty();
        }

        return "";
    }

    public Boolean hasContents() {
        return this._hasMembers;
    }
}
