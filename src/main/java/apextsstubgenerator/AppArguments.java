package apextsstubgenerator;

public class AppArguments {
    private final static String OUTPUT_TYPES_FOLDER = "ts-output/types/";

    private final String _inputPath;
    private final Boolean _isDirectory;
    private String _outputPath = OUTPUT_TYPES_FOLDER;

    public AppArguments(String inputPath, Boolean isDirectory) {
        this._inputPath = inputPath;
        this._isDirectory = isDirectory;
    }

    public String inputPath() {
        return this._inputPath;
    }

    public Boolean isDirectory() {
        return this._isDirectory;
    }

    public void setTsOutputPath(String output) {
        this._outputPath = output;
    }

    public String getTsOutputPath() {
        return this._outputPath;
    }
}
