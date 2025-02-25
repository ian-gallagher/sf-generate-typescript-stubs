package apextsstubgenerator.listeners;

import apextsstubgenerator.antlrapex.apexBaseListener;
import apextsstubgenerator.antlrapex.apexParser.ClassDeclarationContext;
import apextsstubgenerator.antlrapex.apexParser.InterfaceDeclarationContext;
import apextsstubgenerator.antlrapex.apexParser.EnumDeclarationContext;

public class ApexTypeListener extends apexBaseListener {
    private final String targetInnerType;
    private final String targetType;
    private Boolean topLeveLTypeFound = false;

    public ApexTypeListener(
            String targetType,
            String targetInnerType
    ) {
        this.targetType = targetType;
        this.targetInnerType = targetInnerType;
    }

    @Override
    public void enterClassDeclaration(ClassDeclarationContext ctx) {
        // top level matches target type then we exist
        if (this.targetInnerType == null && ctx.Identifier().getText().equals(this.targetType)) {
            throw new TypeFoundException();
        } else if (!this.topLeveLTypeFound && this.targetInnerType != null && ctx.Identifier().getText().equals(this.targetType)) {
            this.topLeveLTypeFound = true;
        } else if (this.topLeveLTypeFound && ctx.Identifier().getText().equals(this.targetInnerType)) {
            throw new TypeFoundException();
        }
    }

    @Override
    public void enterEnumDeclaration(EnumDeclarationContext ctx) {
        if (targetInnerType == null) {
            throw new TypeFoundException();
        }
    }

    @Override
    public void enterInterfaceDeclaration(InterfaceDeclarationContext ctx) {
        if (targetInnerType == null) {
            throw new TypeFoundException();
        }
    }

    // Custom exception to signal that the type has been found
    public static class TypeFoundException extends RuntimeException {
        public TypeFoundException() {
            super("Type found, exiting early.");
        }
    }
}
