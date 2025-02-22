package conversion.type;

import antlrapex.apexParser;
import antlrapex.apexParser.ClassOrInterfaceTypeContext;
import conversion.Writer;
import conversion.type.argument.TypeArgumentInfo;
import conversion.type.argument.TypeArgumentsIterator;
import typeresolution.ResolvedTypeInfo;

public class MapClassType implements IClassOrInterfaceProcessor {
    Writer _tsTypeWriter;
    ITypeConvertUtil _typeConvertUtil;
    TypeUtils _typeUtils;

    public MapClassType(
            Writer tsTypeCreator,
            ITypeConvertUtil typeConvertUtil,
            TypeUtils typeUtils
    ) {
        this._tsTypeWriter = tsTypeCreator;
        this._typeConvertUtil = typeConvertUtil;
        this._typeUtils = typeUtils;
    }

    public void iterateArguments(
            ClassOrInterfaceTypeContext classOrInterfaceType,
            String contextType
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

            this.processArgumentForMapType(innerClassOrInterfaceType, resolvedInnerType.symbol, iterator);
            this._tsTypeWriter.concatLine(this._typeUtils.buildBrackets(typeContext));
        }

        this._tsTypeWriter.concatLine(" }");
    }

    private void processArgumentForMapType(
            ClassOrInterfaceTypeContext innerClassOrInterfaceType,
            String contextType,
            TypeArgumentsIterator iterator
    ) {
        if (innerClassOrInterfaceType != null) {
            // if in the context of a map suffix type with closing bracket "]: " for the key
            if (iterator.isFirst()) {
                this._tsTypeWriter.concatLine(contextType + "]: ");
            } else {
                if (!innerClassOrInterfaceType.typeArguments().isEmpty()) {
                    ClassOrInterfaceTypeFactory.getConversionWriter(
                            contextType,
                            this._tsTypeWriter,
                            this._typeUtils,
                            this._typeConvertUtil
                    ).iterateArguments(innerClassOrInterfaceType, contextType);
                } else {
                    this._tsTypeWriter.concatLine(contextType);
                }
            }


        }
    }
}
