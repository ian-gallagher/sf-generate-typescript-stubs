package conversion.type;

import antlrapex.apexParser;
import conversion.Writer;
import conversion.type.argument.TypeArgumentInfo;
import conversion.type.argument.TypeArgumentsIterator;
import typeresolution.ResolvedTypeInfo;

public class NonMapClassType implements IClassOrInterfaceProcessor {
    Writer _tsTypeWriter;
    ITypeConvertUtil _typeConvertUtil;
    TypeUtils _typeUtils;

    public NonMapClassType(
            Writer tsTypeWriter,
            ITypeConvertUtil typeConvertUtil,
            TypeUtils typeUtils
    ) {
        this._tsTypeWriter = tsTypeWriter;
        this._typeConvertUtil = typeConvertUtil;
        this._typeUtils = typeUtils;
    }

    public void iterateArguments(
            apexParser.ClassOrInterfaceTypeContext classOrInterfaceType,
            String contextType
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
            this._tsTypeWriter.concatLine(resolvedType.resolvedTsSymbol);
            this.processArgumentForNonMapType(innerClassOrInterfaceType, resolvedType.symbol);
            this._tsTypeWriter.concatLine(this._typeUtils.buildBrackets(typeContext));
        }

        this.endType(contextType);
    }

    private void processArgumentForNonMapType(
            apexParser.ClassOrInterfaceTypeContext innerClassOrInterfaceType,
            String contextType
            ) {
        if (innerClassOrInterfaceType != null) {
            if (!innerClassOrInterfaceType.typeArguments().isEmpty()) {
                ClassOrInterfaceTypeFactory.getConversionWriter(
                        contextType,
                        this._tsTypeWriter,
                        this._typeUtils,
                        this._typeConvertUtil
                ).iterateArguments(innerClassOrInterfaceType, contextType);
            }
        }
    }

    private void beginType(String typeIdentifier) {
        // handle special case for type Map
        if (!"List".equals(typeIdentifier)) {
            this._tsTypeWriter.concatLine(typeIdentifier);
        }
    }

    private void endType(String typeIdentifier) {
        if (typeIdentifier.equals("List")) {
            this._tsTypeWriter.concatLine("[]");
        }
    }
}
