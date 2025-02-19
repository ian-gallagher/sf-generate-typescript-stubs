package conversion;

import antlrapex.apexParser;

public class NonMapClassType implements IClassOrInterfaceProcessor {
    TypeUtils _typeUtils;

    public NonMapClassType(TypeUtils typeUtils) {
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
            this.processArgumentForNonMapType(innerClassOrInterfaceType);
            this._typeUtils.writeBrackets(typeContext);
        }

        this.endType(contextType);
    }

    private void processArgumentForNonMapType(
            apexParser.ClassOrInterfaceTypeContext innerClassOrInterfaceType
            ) {
        if (innerClassOrInterfaceType != null) {
            if (!innerClassOrInterfaceType.typeArguments().isEmpty()) {
                String contextType = this._typeUtils.processTypeIdentifier(innerClassOrInterfaceType.Identifier());
                ClassOrInterfaceTypeFactory.getConversionWriter(
                        contextType,
                        this._typeUtils
                ).iterateArguments(innerClassOrInterfaceType, contextType);
            }
        }
    }

    private void beginType(String typeIdentifier) {
        // handle special case for type Map
        if (!"List".equals(typeIdentifier)) {
            this._typeUtils.addTypePart(typeIdentifier);
        }
    }

    private void endType(String typeIdentifier) {
        if (typeIdentifier.equals("List")) {
            this._typeUtils.addTypePart("[]");
        }
    }
}
