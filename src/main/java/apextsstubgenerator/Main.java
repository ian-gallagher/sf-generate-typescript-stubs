package apextsstubgenerator;

import apextsstubgenerator.apex.FileIterator;
import apextsstubgenerator.listeners.ApexParseListener;
import apextsstubgenerator.tsgeneration.type.TypeConverterFactory;
import apextsstubgenerator.tsgeneration.type.TypeUtils;
import apextsstubgenerator.tsgeneration.type.resolution.ITypeResolver;
import apextsstubgenerator.tsgeneration.type.resolution.ResolvedTypeInfo;
import apextsstubgenerator.tsgeneration.type.resolution.TypeResolver;
import apextsstubgenerator.tsgeneration.writers.VariableTypeBuilder;
import apextsstubgenerator.utils.FileUtils;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        AppArguments appArguments = HandleArgs.getArgs(args);
        if (appArguments == null) {
            return;
        }

        Path apexFileOrFolderPath = Paths.get(appArguments.inputPath());
        Path apexFolderPath = appArguments.isDirectory() ? apexFileOrFolderPath : apexFileOrFolderPath.getParent();

        ITypeResolver typeResolver = new TypeResolver(apexFolderPath);
        TypeUtils typeUtils = new TypeUtils(typeResolver);
        TypeConverterFactory typeConverterFactory = new TypeConverterFactory(apexFolderPath, typeUtils);
        VariableTypeBuilder variableTypeBuilder = new VariableTypeBuilder(typeConverterFactory, typeUtils);

        Path outputFolder = appArguments.getTsOutputPath();
        List<Path> tsFiles = new ArrayList<>();

        try (FileIterator fileIterator = (appArguments.isDirectory() ? new FileIterator(apexFolderPath, "cls") : new FileIterator(apexFileOrFolderPath))) {
            while (fileIterator.hasNext()) {
                Path inputFilePath = fileIterator.next();
                if (Files.isRegularFile(inputFilePath)) { // Ensure it's a regular file
                    String apexFileName = inputFilePath.getFileName().toString();
                    System.out.println("Processing file: " + apexFileName);
                    ApexParseListener listenerConverter = new ApexParseListener(
                            outputFolder.toString(),
                            inputFilePath,
                            typeUtils,
                            typeConverterFactory,
                            variableTypeBuilder
                    );

                    tsFiles.addAll(listenerConverter.convert());
                    System.out.println("Done: " + inputFilePath.toAbsolutePath());
                }
            }
        } catch (IOException e) {
            System.err.println("Error iterating over files: " + e.getMessage());
        }

        if (!tsFiles.isEmpty()) {
            try (FileWriter indexFileWriter = FileUtils.getTsFileWriter(outputFolder.toString(), "index.ts")) {
                for (Path tsFile : tsFiles) {
                    indexFileWriter.write("export * from '" + FileUtils.getRelativeImportPath(outputFolder, tsFile) + "';\n");
                }
            } catch (IOException e) {
                System.err.println("Error creating index.ts: " + e.getMessage());
            }
        }

        for (Map.Entry<String, ResolvedTypeInfo> entry : typeResolver.getResolvedTypes().entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue().originalSymbol());
        }
    }
}
