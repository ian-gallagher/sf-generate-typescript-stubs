package org.gallaghercodedesign.apextsstubgenerator.tsgeneration.type.argument;

import org.gallaghercodedesign.apextsstubgenerator.antlrapex.apexParser.TypeArgumentsContext;
import org.gallaghercodedesign.apextsstubgenerator.antlrapex.apexParser.TypeArgumentContext;

import java.util.Iterator;
import java.util.List;

public class TypeArgumentsIterator implements Iterator<TypeArgumentInfo> {
    private final List<TypeArgumentsContext> typeArgumentsList;
    private int outerIndex = 0;
    private int innerIndex = 0;
    private boolean hasNext = true;

    public TypeArgumentsIterator(
            List<TypeArgumentsContext> typeArgumentsList
    ) {
        this.typeArgumentsList = typeArgumentsList;
        this.initHasNext();
    }

    @Override
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override
    public TypeArgumentInfo next() {
        if (!this.hasNext) {
            throw new IllegalStateException("No more elements");
        }

        TypeArgumentsContext currentOuter = typeArgumentsList.get(outerIndex);
        TypeArgumentContext currentInner = currentOuter.typeArgument(innerIndex);

        TypeArgumentInfo result = new TypeArgumentInfo(
                currentInner
        );

        advanceToNextValidElement();

        return result;
    }

    // becomes true *after* the first call to next()
    public boolean isFirst() {
        return outerIndex == 0 && innerIndex == 1;
    }
    
    private Boolean initHasNext() {
        if (outerIndex >= typeArgumentsList.size()) {
            this.hasNext = false;
            return false;
        }

        return true;
    }

    private void advanceToNextValidElement() {
        if (!this.initHasNext()) {
            return;
        }
        
        TypeArgumentsContext currentOuter = typeArgumentsList.get(outerIndex);
        if (innerIndex + 1 < currentOuter.typeArgument().size()) {
            innerIndex++;
        } else {
            outerIndex++;
            innerIndex = 0;
        }

        if (outerIndex >= typeArgumentsList.size()) {
            this.hasNext = false;
        }
    }
}
