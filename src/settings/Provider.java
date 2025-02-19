package settings;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Provider {
    private final java.util.Properties _props = new java.util.Properties();

    public Provider() {
        try {
            this._props.load(Files.newInputStream(Paths.get("settings.properties")));
        } catch (IOException e) {
            System.err.println("Error iterating over files: " + e.getMessage());
        }
    }

    public String apexCodeFolderPath() {
        return this._props.getProperty("inputapex.folder.path");
    }
}
