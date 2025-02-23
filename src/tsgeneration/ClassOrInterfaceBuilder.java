package tsgeneration;

import antlrapex.apexParser.ClassDeclarationContext;
import antlrapex.apexParser.Type_Context;
import antlrapex.apexParser.VariableDeclaratorsContext;
import tsgeneration.type.ClassOrInterfaceTypeFactory;
import tsgeneration.type.conversion.ITypeConvertUtil;
import tsgeneration.type.TypeConverterFactory;
import tsgeneration.type.TypeUtils;
import tsgeneration.type.resolution.ResolvedTypeInfo;

public class ClassOrInterfaceBuilder {
    private final TypeUtils _typeUtils;
    private final InterfaceWriter _writer;
    private final TypeConverterFactory _typeConverterFactory;

    public ClassOrInterfaceBuilder(
            TypeUtils typeUtils,
            InterfaceWriter tsWriter,
            TypeConverterFactory typeConverterFactory
    ) {
        this._typeUtils = typeUtils;
        this._writer = tsWriter;
        this._typeConverterFactory = typeConverterFactory;
    }

    public void fieldDeclaration(
            Type_Context fieldType,
            VariableDeclaratorsContext variableDeclarators
    ) {
        this.beginFieldDeclaration(variableDeclarators);

        if (fieldType.classOrInterfaceType() != null) {
            ITypeConvertUtil converter = this._typeConverterFactory.getTypeConverter("ClassOrInterfaceType");
            ResolvedTypeInfo resolvedType = converter.convertType(fieldType.classOrInterfaceType().Identifier());

            // iterate arguments if any
            ClassOrInterfaceTypeFactory.getConversionWriter(
                    resolvedType.originalSymbol(),
                    this._writer,
                    this._typeUtils,
                    converter
            ).iterateArguments(fieldType.classOrInterfaceType(), resolvedType);
        } else if (fieldType.primitiveType() != null) {
            ITypeConvertUtil converter = this._typeConverterFactory.getTypeConverter("PrimitiveType");
            ResolvedTypeInfo resolvedType = converter.convertType(fieldType.primitiveType().getText());
            this._writer.concatLine(resolvedType.getTsSymbol());
        }
    }

    private void beginFieldDeclaration(VariableDeclaratorsContext variableDeclarators) {
        String currentIdentifier = this._typeUtils.processVariableDeclarators(variableDeclarators);
        this._writer.beginLine(currentIdentifier + ": ");
    }

    public void endFieldDeclaration() {
        this._writer.endLine(";");
    }

    public void beginClass(ClassDeclarationContext ctx) {
        this._writer.writeLine("export interface " + ctx.Identifier().getText() + " {");
        this._writer.incrementIndentation();
    }

    public void endClass() {
        this._writer.decrementIndentation();
        this._writer.endLine("}");
    }

    public String getImports() {
        return this._typeConverterFactory.getTypeConverter("ClassOrInterfaceType").flushImports();
    }

    public void flushBody() {
        this._writer.flush();
    }
}
