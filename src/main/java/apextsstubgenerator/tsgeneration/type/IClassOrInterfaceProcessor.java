package apextsstubgenerator.tsgeneration.type;

import apextsstubgenerator.antlrapex.apexParser.ClassOrInterfaceTypeContext;
import apextsstubgenerator.tsgeneration.type.resolution.ResolvedTypeInfo;

public interface IClassOrInterfaceProcessor {
    String iterateArguments(ClassOrInterfaceTypeContext classOrInterfaceType, ResolvedTypeInfo contextType);
}
