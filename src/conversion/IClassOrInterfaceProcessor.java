package conversion;

import antlrapex.apexParser.ClassOrInterfaceTypeContext;

public interface IClassOrInterfaceProcessor {
    void iterateArguments(ClassOrInterfaceTypeContext classOrInterfaceType, String contextType);
}
