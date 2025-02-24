package org.gallaghercodedesign.apextsstubgenerator.tsgeneration.writers;

import org.gallaghercodedesign.apextsstubgenerator.antlrapex.apexParser;
import org.gallaghercodedesign.apextsstubgenerator.tsgeneration.TsFileWriter;

public class ApiMethodBuilder {
    private final VariableTypeBuilder _variableTypeBuilder;
    private final TsFileWriter _tsFileWriter;
    private final String _namespace;

    public ApiMethodBuilder(
            String className,
            VariableTypeBuilder variableTypeBuilder,
            TsFileWriter tsFileWriter
    ) {
        this._namespace = className;
        this._variableTypeBuilder = variableTypeBuilder;
        this._tsFileWriter = tsFileWriter;
    }

    public void methodDeclaration(
            apexParser.Type_Context returnType,
            apexParser.FormalParametersContext formalParameters,
            String methodName
    ) {
        if (this._tsFileWriter.isEmpty()) {
            this._tsFileWriter.appendCode("export namespace ").append(this._namespace).append(" {");
            this._tsFileWriter.incrementIndentation();
        }

        this._tsFileWriter.beginCode("export type ").append(methodName).append(" = ");
        this._tsFileWriter.appendCode("(");
        this.writeFormalParameters(formalParameters);
        this._tsFileWriter.appendCode(") => ");
        this._tsFileWriter.appendCode(this._variableTypeBuilder.convertType(returnType));
        this._tsFileWriter.appendCode(";");
    }

    public TsFileWriter getWriter() {
        if (!this._tsFileWriter.isEmpty()) {
            this._tsFileWriter.decrementIndentation();
            this._tsFileWriter.beginCode("}");
        }
        return this._tsFileWriter;
    }

    private void writeFormalParameters(apexParser.FormalParametersContext formalParameters) {
        apexParser.FormalParameterListContext formalParameterList = formalParameters.formalParameterList();
        for (apexParser.FormalParameterContext formalParameter : formalParameterList.formalParameter()) {
            this._tsFileWriter.appendCode(formalParameter.variableDeclaratorId().getText()).append(": ");
            this._tsFileWriter.appendCode(this._variableTypeBuilder.convertType(formalParameter.type_()));
        }
    }
}
