package apextsstubgenerator.processing.files;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ProcessedApexFileResult {
    public List<Path> generatedTsFiles = new ArrayList<>();
    public Path inputApexFile = null;
}
