package conversion;

import antlrapex.apexParser;
import antlrapex.apexParser.ClassOrInterfaceTypeContext;

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
            this.processArgumentForMapType(innerClassOrInterfaceType, iterator);
            this._typeUtils.writeBrackets(typeContext);
        }

        this._typeUtils.addTypePart(" }");
    }

    private void processArgumentForMapType(
            ClassOrInterfaceTypeContext innerClassOrInterfaceType,
            TypeArgumentsIterator iterator
    ) {
        if (innerClassOrInterfaceType != null) {
            String convertedTypeIdentifier = this._typeUtils.processTypeIdentifier(innerClassOrInterfaceType.Identifier());

            this.processMapArg(convertedTypeIdentifier, iterator);

            if (!innerClassOrInterfaceType.typeArguments().isEmpty()) {
                ClassOrInterfaceTypeFactory.getConversionWriter(
                        convertedTypeIdentifier,
                        this._typeUtils
                ).iterateArguments(innerClassOrInterfaceType, convertedTypeIdentifier);
            }
        }
    }

    private void processMapArg(
            String convertedTypeIdentifier,
            TypeArgumentsIterator iterator
    ) {
        // if in the context of a map suffix type with closing bracket "]: " for the key
        if (iterator.isFirst()) {
            this._typeUtils.addTypePart(convertedTypeIdentifier + "]: ");
        }
    }
}
