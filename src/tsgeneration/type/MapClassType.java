package tsgeneration.type;

import antlrapex.apexParser;
import antlrapex.apexParser.ClassOrInterfaceTypeContext;
import tsgeneration.type.argument.TypeArgumentInfo;
import tsgeneration.type.argument.TypeArgumentsIterator;
import tsgeneration.type.conversion.ITypeConvertUtil;
import tsgeneration.type.resolution.ResolvedTypeInfo;

public class MapClassType implements IClassOrInterfaceProcessor {
    ITypeConvertUtil _typeConvertUtil;
    TypeUtils _typeUtils;

    public MapClassType(
            ITypeConvertUtil typeConvertUtil,
            TypeUtils typeUtils
    ) {
        this._typeConvertUtil = typeConvertUtil;
        this._typeUtils = typeUtils;
    }

    public String iterateArguments(
            ClassOrInterfaceTypeContext classOrInterfaceType,
            ResolvedTypeInfo contextType
    ) {
        StringBuilder typeBuilder = new StringBuilder();
        typeBuilder.append("{ [key: ");

        if (classOrInterfaceType.typeArguments().isEmpty()) {
            return "";
        }

        TypeArgumentsIterator iterator = new TypeArgumentsIterator(
                classOrInterfaceType.typeArguments()
        );

        while (iterator.hasNext()) {
            TypeArgumentInfo typeArgumentInfo = iterator.next();
            apexParser.Type_Context typeContext = typeArgumentInfo.getTypeArgumentContext().type_();
            ClassOrInterfaceTypeContext innerClassOrInterfaceType = typeContext.classOrInterfaceType();
            ResolvedTypeInfo resolvedInnerType = this._typeConvertUtil.convertType(innerClassOrInterfaceType.Identifier());

            typeBuilder.append(this.processArgumentForMapType(innerClassOrInterfaceType, resolvedInnerType, iterator));
            typeBuilder.append(this._typeUtils.buildBrackets(typeContext));
        }

        typeBuilder.append(" }");
        return typeBuilder.toString();
    }

    private String processArgumentForMapType(
            ClassOrInterfaceTypeContext innerClassOrInterfaceType,
            ResolvedTypeInfo contextType,
            TypeArgumentsIterator iterator
    ) {
        if (innerClassOrInterfaceType != null) {
            // if in the context of a map suffix type with closing bracket "]: " for the key
            if (iterator.isFirst()) {
                return contextType.getTsSymbol() + "]: ";
            } else {
                if (!innerClassOrInterfaceType.typeArguments().isEmpty()) {
                    return ClassOrInterfaceTypeFactory.getConversionWriter(
                            contextType.originalSymbol(),
                            this._typeUtils,
                            this._typeConvertUtil
                    ).iterateArguments(innerClassOrInterfaceType, contextType);
                } else {
                    return contextType.getTsSymbol();
                }
            }
        }

        return "";
    }
}
