package tsgeneration;

import java.io.FileWriter;
import java.io.IOException;

public class TsFileWriter {
    private final FileWriter _writer;
    private Integer _indentationLevel = 0;
    private final StringBuilder _currentBodyOutput = new StringBuilder();

    public TsFileWriter(
            FileWriter fileWriter
    ) {
        this._writer = fileWriter;
    }

    public StringBuilder beginCode(String code) {
        return this._currentBodyOutput.append("\n").append(getIndentation()).append(code);
    }

    public StringBuilder appendCode(String code) {
        return this._currentBodyOutput.append(code);
    }

    public void incrementIndentation() {
        this._indentationLevel++;
    }

    public void decrementIndentation() {
        this._indentationLevel--;
    }

    public void flush() {
        try {
            String code = this._currentBodyOutput.toString();
            this._writer.write(code);
            this._currentBodyOutput.setLength(0);
        } catch (IOException e) {
            throw new RuntimeException("Failed to write to TypeScript file");
        }
    }

    public Boolean isEmpty() {
        return this._currentBodyOutput.isEmpty();
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
