package tsgeneration.type;

import antlrapex.apexParser;
import antlrapex.apexParser.ClassOrInterfaceTypeContext;
import tsgeneration.InterfaceWriter;
import tsgeneration.type.argument.TypeArgumentInfo;
import tsgeneration.type.argument.TypeArgumentsIterator;
import tsgeneration.type.conversion.ITypeConvertUtil;
import tsgeneration.type.resolution.ResolvedTypeInfo;

public class MapClassType implements IClassOrInterfaceProcessor {
    InterfaceWriter _tsTypeWriter;
    ITypeConvertUtil _typeConvertUtil;
    TypeUtils _typeUtils;

    public MapClassType(
            InterfaceWriter tsTypeCreator,
            ITypeConvertUtil typeConvertUtil,
            TypeUtils typeUtils
    ) {
        this._tsTypeWriter = tsTypeCreator;
        this._typeConvertUtil = typeConvertUtil;
        this._typeUtils = typeUtils;
    }

    public void iterateArguments(
            ClassOrInterfaceTypeContext classOrInterfaceType,
            ResolvedTypeInfo contextType
    ) {
        this._tsTypeWriter.concatLine("{ [key: ");

        if (classOrInterfaceType.typeArguments().isEmpty()) {
            return;
        }

        TypeArgumentsIterator iterator = new TypeArgumentsIterator(
                classOrInterfaceType.typeArguments()
        );

        while (iterator.hasNext()) {
            TypeArgumentInfo typeArgumentInfo = iterator.next();
            apexParser.Type_Context typeContext = typeArgumentInfo.getTypeArgumentContext().type_();
            ClassOrInterfaceTypeContext innerClassOrInterfaceType = typeContext.classOrInterfaceType();
            ResolvedTypeInfo resolvedInnerType = this._typeConvertUtil.convertType(innerClassOrInterfaceType.Identifier());

            this.processArgumentForMapType(innerClassOrInterfaceType, resolvedInnerType, iterator);
            this._tsTypeWriter.concatLine(this._typeUtils.buildBrackets(typeContext));
        }

        this._tsTypeWriter.concatLine(" }");
    }

    private void processArgumentForMapType(
            ClassOrInterfaceTypeContext innerClassOrInterfaceType,
            ResolvedTypeInfo contextType,
            TypeArgumentsIterator iterator
    ) {
        if (innerClassOrInterfaceType != null) {
            // if in the context of a map suffix type with closing bracket "]: " for the key
            if (iterator.isFirst()) {
                this._tsTypeWriter.concatLine(contextType.getTsSymbol() + "]: ");
            } else {
                if (!innerClassOrInterfaceType.typeArguments().isEmpty()) {
                    ClassOrInterfaceTypeFactory.getConversionWriter(
                            contextType.originalSymbol(),
                            this._tsTypeWriter,
                            this._typeUtils,
                            this._typeConvertUtil
                    ).iterateArguments(innerClassOrInterfaceType, contextType);
                } else {
                    this._tsTypeWriter.concatLine(contextType.getTsSymbol());
                }
            }


        }
    }
}
