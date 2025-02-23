package tsgeneration;

import java.io.FileWriter;
import java.io.IOException;

public class InterfaceWriter {
    private final FileWriter _writer;
    private Integer _indentationLevel = 0;
    private final StringBuilder _currentBodyOutput = new StringBuilder();

    public InterfaceWriter(
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
        this._currentBodyOutput.append(code);
    }

    public void flush() {
        try {
            this._writer.write(this._currentBodyOutput.toString());
            this._currentBodyOutput.setLength(0);
        } catch (IOException e) {
            throw new RuntimeException("Failed to write to TypeScript file");
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
}
