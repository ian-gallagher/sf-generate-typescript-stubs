package tsgeneration.type;

import antlrapex.apexParser;
import tsgeneration.InterfaceWriter;
import tsgeneration.type.argument.TypeArgumentInfo;
import tsgeneration.type.argument.TypeArgumentsIterator;
import tsgeneration.type.conversion.ITypeConvertUtil;
import tsgeneration.type.resolution.ResolvedTypeInfo;

public class NonMapClassType implements IClassOrInterfaceProcessor {
    InterfaceWriter _tsTypeWriter;
    ITypeConvertUtil _typeConvertUtil;
    TypeUtils _typeUtils;

    public NonMapClassType(
            InterfaceWriter tsTypeWriter,
            ITypeConvertUtil typeConvertUtil,
            TypeUtils typeUtils
    ) {
        this._tsTypeWriter = tsTypeWriter;
        this._typeConvertUtil = typeConvertUtil;
        this._typeUtils = typeUtils;
    }

    public void iterateArguments(
            apexParser.ClassOrInterfaceTypeContext classOrInterfaceType,
            ResolvedTypeInfo contextType
    ) {
        this.beginType(contextType);

        if (classOrInterfaceType.typeArguments().isEmpty()) {
            return;
        }

        TypeArgumentsIterator iterator = new TypeArgumentsIterator(
                classOrInterfaceType.typeArguments()
        );

        while (iterator.hasNext()) {
            TypeArgumentInfo typeArgumentInfo = iterator.next();
            apexParser.Type_Context typeContext = typeArgumentInfo.getTypeArgumentContext().type_();
            apexParser.ClassOrInterfaceTypeContext innerClassOrInterfaceType = typeContext.classOrInterfaceType();
            ResolvedTypeInfo resolvedType = this._typeConvertUtil.convertType(innerClassOrInterfaceType.Identifier());
            this._tsTypeWriter.concatLine(resolvedType.getTsSymbol());
            this.processArgumentForNonMapType(innerClassOrInterfaceType, resolvedType);
            this._tsTypeWriter.concatLine(this._typeUtils.buildBrackets(typeContext));
        }

        this.endType(contextType);
    }

    private void processArgumentForNonMapType(
            apexParser.ClassOrInterfaceTypeContext innerClassOrInterfaceType,
            ResolvedTypeInfo contextType
            ) {
        if (innerClassOrInterfaceType != null) {
            if (!innerClassOrInterfaceType.typeArguments().isEmpty()) {
                ClassOrInterfaceTypeFactory.getConversionWriter(
                        contextType.originalSymbol(),
                        this._tsTypeWriter,
                        this._typeUtils,
                        this._typeConvertUtil
                ).iterateArguments(innerClassOrInterfaceType, contextType);
            }
        }
    }

    private void beginType(ResolvedTypeInfo typeIdentifier) {
        // handle special case for type Map
        if (!"List".equals(typeIdentifier.originalSymbol())) {
            this._tsTypeWriter.concatLine(typeIdentifier.getTsSymbol());
        }
    }

    private void endType(ResolvedTypeInfo typeIdentifier) {
        if (typeIdentifier.originalSymbol().equals("List")) {
            this._tsTypeWriter.concatLine("[]");
        }
    }
}
