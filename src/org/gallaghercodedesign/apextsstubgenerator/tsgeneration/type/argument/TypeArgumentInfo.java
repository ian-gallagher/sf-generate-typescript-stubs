package org.gallaghercodedesign.apextsstubgenerator.tsgeneration.type.argument;

import org.gallaghercodedesign.apextsstubgenerator.antlrapex.apexParser.TypeArgumentContext;

public class TypeArgumentInfo {
    private final TypeArgumentContext typeArgumentContext;

    public TypeArgumentInfo(
            TypeArgumentContext typeArgumentContext
    ) {
        this.typeArgumentContext = typeArgumentContext;
    }

    public TypeArgumentContext getTypeArgumentContext() {
        return typeArgumentContext;
    }

    @Override
    public String toString() {
        return "TypeArgumentInfo{" +
                ", typeArgumentContext=" + typeArgumentContext +
                '}';
    }
}
