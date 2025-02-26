package apextsstubgenerator;

import java.nio.file.Path;
import java.nio.file.Paths;

public class AppArguments {
    private final static String OUTPUT_FOLDER_PATH = "ts-output/";

    private final String _inputPath;
    private final Boolean _isDirectory;
    private Path _outputPath = Paths.get(OUTPUT_FOLDER_PATH);

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
        this._outputPath = Paths.get(output);
    }

    public Path getTsOutputPath() {
        return this._outputPath;
    }
}
