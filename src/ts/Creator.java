package ts;

import antlrapex.apexParser.FieldDeclarationContext;
import conversion.ClassOrInterface;
import conversion.PrimitiveTypeWriter;
import ts.types.ClassDeclaration;

public class Creator {
    private final Writer _writer;
    public final ClassOrInterface _classOrInterfaceWriter;
    public final PrimitiveTypeWriter _primitiveTypeWriter;

    public Creator(
            Writer fileWriter,
            ClassOrInterface classOrInterfaceWriter,
            PrimitiveTypeWriter primitiveTypeWriter
    ) {
        this._writer = fileWriter;
        this._classOrInterfaceWriter = classOrInterfaceWriter;
        this._primitiveTypeWriter = primitiveTypeWriter;
    }

    public void fieldDeclaration(FieldDeclarationContext fieldCtx) {
        if (fieldCtx.type_().classOrInterfaceType() != null) {
            this._classOrInterfaceWriter.process(fieldCtx);
        } else if (fieldCtx.type_().primitiveType() != null) {
            this._primitiveTypeWriter.process(fieldCtx);
        }
    }

    public void endFieldDeclaration() {
        this._writer.endLine(";");
    }

    public void beginClass(ClassDeclaration classDeclaration) {
        this._writer.writeLine("export interface " + classDeclaration.name + " {");
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
