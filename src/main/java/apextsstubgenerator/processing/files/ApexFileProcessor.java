package apextsstubgenerator.processing.files;

import apextsstubgenerator.AppArguments;
import apextsstubgenerator.apex.FileIterator;
import apextsstubgenerator.listeners.ApexParseListener;
import apextsstubgenerator.listeners.ApexParseListenerInput;
import apextsstubgenerator.tsgeneration.type.resolution.ResolvedTypeInfo;
import apextsstubgenerator.utils.FileUtils;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ApexFileProcessor {
    List<ProcessedApexFileResult> processedApexFileResults = new ArrayList<>();
    List<Path> processedApexFiles = new ArrayList<>();
    private final AppArguments _appArguments;
    private final ApexParseListenerInput _parserListenerInput;

    public ApexFileProcessor(
            AppArguments appArguments,
            ApexParseListenerInput parserListenerInput
    ) {
        this._appArguments = appArguments;
        this._parserListenerInput = parserListenerInput;
    }

    public void processFiles() {
        Path apexFileOrFolderPath = Paths.get(this._appArguments.inputPath());
        Path apexFolderPath = this._appArguments.apexFolderPath();

        try (FileIterator fileIterator = (this._appArguments.isDirectory() ?
                new FileIterator(apexFolderPath, "cls") :
                new FileIterator(apexFileOrFolderPath))) {
            while (fileIterator.hasNext()) {
                Path inputFilePath = fileIterator.next();
                if (Files.isRegularFile(inputFilePath)) { // Ensure it's a regular file
                    this.handleProcessFile(this.getParserInput(inputFilePath, this._appArguments.getTsBaseOutputFolder()));
                }
            }
        } catch (IOException e) {
            System.err.println("Error iterating over files: " + e.getMessage());
        }

        this.processResolvedTypes();

        if (!this.processedApexFileResults.isEmpty()) {
            this.writeIndexTsFile(this._appArguments.getTsBaseOutputFolder());
        }
    }

    /**
     * Process resolved types which are not already processed/included in the generated files
     */
    private void processResolvedTypes() {
        // Recursively process newly resolved types
        boolean newTypesResolved;

        do {
            newTypesResolved = false;
            Map<String, ResolvedTypeInfo> resolvedTypes = this._parserListenerInput.getTypeResolver().flushResolvedTypes();

            for (ResolvedTypeInfo resolvedTypeInfo : resolvedTypes.values()) {
                Path resolvedFilePath = resolvedTypeInfo.getFile().toPath();

                if (!this.processedApexFiles.contains(resolvedFilePath)) {
                    // even if processing file fails we still want to mark it as processed
                    this.handleProcessFile(this.getParserInput(resolvedFilePath, this._appArguments.getTsBaseOutputFolder()));
                    newTypesResolved = true;
                }
            }
        } while (newTypesResolved);
    }

    /**
     * For efficiency, we reuse the same ApexParseListenerInput object for each file
     * @param inputFilePath path to input apex file
     * @param tsBaseOutputFolder typescript base output folder
     * @return ApexParseListenerInput object with updated input/output paths
     */
    private ApexParseListenerInput getParserInput(Path inputFilePath, Path tsBaseOutputFolder) {
        this._parserListenerInput.setInputPath(inputFilePath);
        this._parserListenerInput.setOutputFolder(tsBaseOutputFolder);
        return this._parserListenerInput;
    }

    /**
     * Write index.ts file to the output folder from processed apex and generated TS files
     * @param tsBaseOutputFolder typescript base output folder
     */
    private void writeIndexTsFile(Path tsBaseOutputFolder) {
        try (FileWriter indexFileWriter = FileUtils.getTsFileWriter(tsBaseOutputFolder.toString(), "index.ts")) {
            for (ProcessedApexFileResult processedApexFileResult : this.processedApexFileResults) {
                for (Path generatedTsFilePath : processedApexFileResult.generatedTsFiles) {
                    String importPath = FileUtils.getRelativeImportPath(tsBaseOutputFolder, generatedTsFilePath);
                    indexFileWriter.write("export * from '" + importPath + "';\n");
                }
            }
        } catch (IOException e) {
            System.err.println("Error creating index.ts: " + e.getMessage());
        }
    }

    private void handleProcessFile(ApexParseListenerInput input) {
        ProcessedApexFileResult processedApexFileResult = this.processFile(input);

        if (processedApexFileResult != null) {
            this.processedApexFileResults.add(processedApexFileResult);
            this.processedApexFiles.add(processedApexFileResult.inputApexFile);
        }
    }

    private ProcessedApexFileResult processFile(
            ApexParseListenerInput apexParserInput
    ) {
        String apexFileName = apexParserInput.getInputPath().getFileName().toString();
        System.out.println("Processing file: " + apexFileName);

        try {
            ApexParseListener listenerConverter = new ApexParseListener(apexParserInput);

            ProcessedApexFileResult processedApexFileResult = new ProcessedApexFileResult();
            processedApexFileResult.inputApexFile = apexParserInput.getInputPath();
            processedApexFileResult.generatedTsFiles = listenerConverter.convert();
            System.out.println("Done: " + apexParserInput.getInputPath().toAbsolutePath());
            return processedApexFileResult;
        } catch (IOException e) {
            System.err.println("Error converting file: " + e.getMessage());
            return null;
        }
    }
}
