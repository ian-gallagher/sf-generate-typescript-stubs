package apextsstubgenerator.tsgeneration.type.argument;

import apextsstubgenerator.antlrapex.apexParser.TypeArgumentContext;

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
