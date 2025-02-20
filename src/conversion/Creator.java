package conversion;

import antlrapex.apexParser.FieldDeclarationContext;
import antlrapex.apexParser.PropertyDeclarationContext;
import antlrapex.apexParser.ClassDeclarationContext;
import conversion.writers.ClassOrInterfaceWriter;
import conversion.writers.PrimitiveTypeWriter;

public class Creator {
    private final Writer _writer;
    public final ClassOrInterfaceWriter _classOrInterfaceWriter;
    public final PrimitiveTypeWriter _primitiveTypeWriter;

    public Creator(
            Writer fileWriter,
            ClassOrInterfaceWriter classOrInterfaceWriter,
            PrimitiveTypeWriter primitiveTypeWriter
    ) {
        this._writer = fileWriter;
        this._classOrInterfaceWriter = classOrInterfaceWriter;
        this._primitiveTypeWriter = primitiveTypeWriter;
    }

    public void fieldDeclaration(FieldDeclarationContext fieldCtx) {
        if (fieldCtx.type_().classOrInterfaceType() != null) {
            this._classOrInterfaceWriter.process(
                    fieldCtx.type_().classOrInterfaceType(),
                    fieldCtx.variableDeclarators()
            );
        } else if (fieldCtx.type_().primitiveType() != null) {
            this._primitiveTypeWriter.process(
                    fieldCtx.type_().primitiveType(),
                    fieldCtx.variableDeclarators()
            );
        }
    }

    public void endFieldDeclaration() {
        this._writer.endLine(";");
    }

    public void propertyDeclaration(PropertyDeclarationContext propertyCtx) {
        if (propertyCtx.type_().classOrInterfaceType() != null) {
            this._classOrInterfaceWriter.process(
                    propertyCtx.type_().classOrInterfaceType(),
                    propertyCtx.variableDeclarators()
            );
        } else if (propertyCtx.type_().primitiveType() != null) {
            this._primitiveTypeWriter.process(
                    propertyCtx.type_().primitiveType(),
                    propertyCtx.variableDeclarators()
            );
        }
    }

    public void beginClass(ClassDeclarationContext ctx) {
        this._writer.writeLine("export interface " + ctx.Identifier().getText() + " {");
        this._writer.incrementIndentation();
    }

    public void endClass() {
        this._writer.decrementIndentation();
        this._writer.endLine("}");
    }

    public void close() {
        this._writer.close();
    }
}
