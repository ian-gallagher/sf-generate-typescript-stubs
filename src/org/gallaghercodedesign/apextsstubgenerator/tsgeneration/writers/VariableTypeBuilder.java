package org.gallaghercodedesign.apextsstubgenerator.tsgeneration.writers;

import org.gallaghercodedesign.apextsstubgenerator.antlrapex.apexParser;
import org.gallaghercodedesign.apextsstubgenerator.tsgeneration.type.ClassOrInterfaceTypeFactory;
import org.gallaghercodedesign.apextsstubgenerator.tsgeneration.type.TypeConverterFactory;
import org.gallaghercodedesign.apextsstubgenerator.tsgeneration.type.TypeUtils;
import org.gallaghercodedesign.apextsstubgenerator.tsgeneration.type.conversion.ITypeConvertUtil;
import org.gallaghercodedesign.apextsstubgenerator.tsgeneration.type.resolution.ResolvedTypeInfo;

public class VariableTypeBuilder {
    private final TypeConverterFactory _typeConverterFactory;
    private final TypeUtils _typeUtils;

    public VariableTypeBuilder(
            TypeConverterFactory typeConverterFactory,
            TypeUtils typeUtils
    ) {
        this._typeConverterFactory = typeConverterFactory;
        this._typeUtils = typeUtils;
    }

    public String convertType(apexParser.Type_Context fieldType) {
        if (fieldType.classOrInterfaceType() != null) {
            ITypeConvertUtil converter = this._typeConverterFactory.getTypeConverter("ClassOrInterfaceType");
            ResolvedTypeInfo resolvedType = converter.convertType(fieldType.classOrInterfaceType().Identifier());

            // iterate arguments if any
            return ClassOrInterfaceTypeFactory.getConversionWriter(
                    resolvedType.originalSymbol(),
                    this._typeUtils,
                    converter
            ).iterateArguments(fieldType.classOrInterfaceType(), resolvedType);
        } else if (fieldType.primitiveType() != null) {
            ITypeConvertUtil converter = this._typeConverterFactory.getTypeConverter("PrimitiveType");
            ResolvedTypeInfo resolvedType = converter.convertType(fieldType.primitiveType().getText());
            return resolvedType.getTsSymbol();
        }

        return "";
    }
}
