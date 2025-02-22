package conversion.writers;

import antlrapex.apexParser.VariableDeclaratorsContext;
import antlrapex.apexParser.PrimitiveTypeContext;
import conversion.Writer;
import conversion.type.ITypeConvertUtil;
import typeresolution.ResolvedTypeInfo;

public class PrimitiveTypeWriter {
    private final Writer _tsTypeWriter;
    private final ITypeConvertUtil _typeConvertUtil;

    public PrimitiveTypeWriter(
            Writer tsTypeWriter,
            ITypeConvertUtil typeConvertUtil
    ) {
        this._tsTypeWriter = tsTypeWriter;
        this._typeConvertUtil = typeConvertUtil;
    }

    public void process(
            PrimitiveTypeContext primitiveType,
            VariableDeclaratorsContext variableDeclarators
    ) {
        this.getPrintFieldDeclarator(variableDeclarators);
        // get current converted/sanitized type
        ResolvedTypeInfo currentConvertedType = this._typeConvertUtil.convertType(primitiveType.getText());
        this._tsTypeWriter.concatLine(currentConvertedType.resolvedTsSymbol);
    }

    /**
     * Iterates over variable declarators and begins the type part. This is the variable name.
     * @param variableDeclarators variableDeclarators context list
     */
    private void getPrintFieldDeclarator(VariableDeclaratorsContext variableDeclarators) {
        String currentIdentifier = variableDeclarators.variableDeclarator(0).getText();
        this._tsTypeWriter.beginLine(currentIdentifier + ": ");
    }
}
