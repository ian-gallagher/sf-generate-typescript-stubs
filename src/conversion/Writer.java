package conversion;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    private final FileWriter _writer;
    private Integer _indentationLevel = 0;

    public Writer(
            FileWriter fileWriter
    ) {
        this._writer = fileWriter;
    }

    public void writeLine(String code) {
        this.write(getIndentation() + code + "\n");
    }

    public void beginLine(String code) {
        this.write(getIndentation() + code);
    }

    public void endLine(String code) {
        this.write(code + "\n");
    }

    public void concatLine(String code) {
        this.write(code);
    }

    public void incrementIndentation() {
        this._indentationLevel++;
    }

    public void decrementIndentation() {
        this._indentationLevel--;
    }

    private void write(String code) {
        try {
            this._writer.write(code);
        } catch (IOException e) {
            throw new RuntimeException("Failed to write code to TypeScript file");
        }
    }

    /**
     * Returns a string containing two space characters, repeated _indentationLevel times.
     *
     * @return A string representing the indentation.
     */
    private String getIndentation() {
        return "  ".repeat(Math.max(0, this._indentationLevel));
    }

    public void close() {
        try {
            this._writer.close();
        } catch (IOException e) {
            throw new RuntimeException("Failed to close TypeScript file");
        }
    }
}
