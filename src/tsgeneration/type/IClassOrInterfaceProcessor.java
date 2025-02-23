package tsgeneration.type;

import antlrapex.apexParser.ClassOrInterfaceTypeContext;
import tsgeneration.type.resolution.ResolvedTypeInfo;

public interface IClassOrInterfaceProcessor {
    void iterateArguments(ClassOrInterfaceTypeContext classOrInterfaceType, ResolvedTypeInfo contextType);
}
