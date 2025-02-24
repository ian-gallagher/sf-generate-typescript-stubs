package org.gallaghercodedesign.apextsstubgenerator.tsgeneration.type;

import org.gallaghercodedesign.apextsstubgenerator.antlrapex.apexParser.ClassOrInterfaceTypeContext;
import org.gallaghercodedesign.apextsstubgenerator.tsgeneration.type.resolution.ResolvedTypeInfo;

public interface IClassOrInterfaceProcessor {
    String iterateArguments(ClassOrInterfaceTypeContext classOrInterfaceType, ResolvedTypeInfo contextType);
}
