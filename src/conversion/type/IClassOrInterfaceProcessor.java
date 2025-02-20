package conversion.type;

import antlrapex.apexParser.ClassOrInterfaceTypeContext;

public interface IClassOrInterfaceProcessor {
    void iterateArguments(ClassOrInterfaceTypeContext classOrInterfaceType, String contextType);
}
