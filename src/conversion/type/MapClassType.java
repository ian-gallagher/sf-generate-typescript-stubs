package conversion.type;

import antlrapex.apexParser;
import antlrapex.apexParser.ClassOrInterfaceTypeContext;
import conversion.type.argument.TypeArgumentInfo;
import conversion.type.argument.TypeArgumentsIterator;

public class MapClassType implements IClassOrInterfaceProcessor {
    TypeUtils _typeUtils;

    public MapClassType(
            TypeUtils typeUtils
    ) {
        this._typeUtils = typeUtils;
    }

    public void iterateArguments(
            ClassOrInterfaceTypeContext classOrInterfaceType,
            String contextType
    ) {
        this._typeUtils.addTypePart("{ [key: ");

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
            String innerContextType = this._typeUtils.processTypeIdentifier(innerClassOrInterfaceType.Identifier());
            this.processArgumentForMapType(innerClassOrInterfaceType, innerContextType, iterator);
            this._typeUtils.writeBrackets(typeContext);
        }

        this._typeUtils.addTypePart(" }");
    }

    private void processArgumentForMapType(
            ClassOrInterfaceTypeContext innerClassOrInterfaceType,
            String contextType,
            TypeArgumentsIterator iterator
    ) {
        if (innerClassOrInterfaceType != null) {
            // if in the context of a map suffix type with closing bracket "]: " for the key
            if (iterator.isFirst()) {
                this._typeUtils.addTypePart(contextType + "]: ");
            } else {
                if (!innerClassOrInterfaceType.typeArguments().isEmpty()) {
                    ClassOrInterfaceTypeFactory.getConversionWriter(
                            contextType,
                            this._typeUtils
                    ).iterateArguments(innerClassOrInterfaceType, contextType);
                } else {
                    this._typeUtils.addTypePart(contextType);
                }
            }


        }
    }
}
