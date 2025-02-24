package org.gallaghercodedesign.apextsstubgenerator.tsgeneration.type;

import org.gallaghercodedesign.apextsstubgenerator.antlrapex.apexParser;
import org.gallaghercodedesign.apextsstubgenerator.tsgeneration.type.argument.TypeArgumentInfo;
import org.gallaghercodedesign.apextsstubgenerator.tsgeneration.type.argument.TypeArgumentsIterator;
import org.gallaghercodedesign.apextsstubgenerator.tsgeneration.type.conversion.ITypeConvertUtil;
import org.gallaghercodedesign.apextsstubgenerator.tsgeneration.type.resolution.ResolvedTypeInfo;

public class NonMapClassType implements IClassOrInterfaceProcessor {
    ITypeConvertUtil _typeConvertUtil;
    TypeUtils _typeUtils;
    StringBuilder typeBuilder = new StringBuilder();

    public NonMapClassType(
            ITypeConvertUtil typeConvertUtil,
            TypeUtils typeUtils
    ) {
        this._typeConvertUtil = typeConvertUtil;
        this._typeUtils = typeUtils;
    }

    public String iterateArguments(
            apexParser.ClassOrInterfaceTypeContext classOrInterfaceType,
            ResolvedTypeInfo contextType
    ) {
        this.beginType(contextType);

        if (classOrInterfaceType.typeArguments().isEmpty()) {
            return contextType.getTsSymbol();
        }

        TypeArgumentsIterator iterator = new TypeArgumentsIterator(
                classOrInterfaceType.typeArguments()
        );

        while (iterator.hasNext()) {
            TypeArgumentInfo typeArgumentInfo = iterator.next();
            apexParser.Type_Context typeContext = typeArgumentInfo.getTypeArgumentContext().type_();
            apexParser.ClassOrInterfaceTypeContext innerClassOrInterfaceType = typeContext.classOrInterfaceType();
            ResolvedTypeInfo resolvedType = this._typeConvertUtil.convertType(innerClassOrInterfaceType.Identifier());
            this.typeBuilder.append(resolvedType.getTsSymbol());
            this.typeBuilder.append(this.processArgumentForNonMapType(innerClassOrInterfaceType, resolvedType));
            this.typeBuilder.append(this._typeUtils.buildBrackets(typeContext));
        }

        this.endType(contextType);
        String typeContents = this.typeBuilder.toString();
        this.typeBuilder.setLength(0);
        return typeContents;
    }

    private String processArgumentForNonMapType(
            apexParser.ClassOrInterfaceTypeContext innerClassOrInterfaceType,
            ResolvedTypeInfo contextType
            ) {
        if (innerClassOrInterfaceType != null) {
            if (!innerClassOrInterfaceType.typeArguments().isEmpty()) {
                return ClassOrInterfaceTypeFactory.getConversionWriter(
                        contextType.originalSymbol(),
                        this._typeUtils,
                        this._typeConvertUtil
                ).iterateArguments(innerClassOrInterfaceType, contextType);
            }
        }

        return "";
    }

    private void beginType(ResolvedTypeInfo typeIdentifier) {
        // handle special case for type Map
        if (!"List".equals(typeIdentifier.originalSymbol())) {
            this.typeBuilder.append(typeIdentifier.getTsSymbol());
        }
    }

    private void endType(ResolvedTypeInfo typeIdentifier) {
        if (typeIdentifier.originalSymbol().equals("List")) {
            this.typeBuilder.append("[]");
        }
    }
}
