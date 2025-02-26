package apextsstubgenerator.tsgeneration;

public class TsFileWriter {
    private Integer _indentationLevel = 0;
    private final StringBuilder _currentBodyOutput = new StringBuilder();

    public TsFileWriter() {
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

    public String empty() {
        if (this._currentBodyOutput.isEmpty()) {
            // if no contents don't create and write file
            return "";
        }

        this._currentBodyOutput.append("\n");

        String bodyContents = this._currentBodyOutput.toString();
        this._currentBodyOutput.setLength(0);
        return bodyContents;
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
