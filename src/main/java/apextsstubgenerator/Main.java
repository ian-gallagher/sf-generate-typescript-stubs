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
    private final static List<String> tsFilesProcessed = new ArrayList<>();

    public static void main(String[] args) {
        AppArguments appArguments = HandleArgs.getArgs(args);
        if (appArguments == null) {
            return;
        }

        Path apexCodeFolderPath = Paths.get(appArguments.inputPath());

        ITypeResolver typeResolver = new TypeResolver(apexCodeFolderPath);
        TypeUtils typeUtils = new TypeUtils(typeResolver);
        TypeConverterFactory typeConverterFactory = new TypeConverterFactory(apexCodeFolderPath, typeUtils);
        VariableTypeBuilder variableTypeBuilder = new VariableTypeBuilder(typeConverterFactory, typeUtils);

        String outputFolder = appArguments.getTsOutputPath();

        try (FileIterator fileIterator = (appArguments.isDirectory() ? new FileIterator(apexCodeFolderPath, "cls") : new FileIterator(apexCodeFolderPath))) {
            while (fileIterator.hasNext()) {
                Path file = fileIterator.next();
                if (Files.isRegularFile(file)) { // Ensure it's a regular file
                    String apexFileName = file.getFileName().toString();
                    System.out.println("Processing file: " + apexFileName);

                    try (FileWriter tsFileWriter = FileUtils.getTsFileWriter(outputFolder, FileUtils.removeExtension(apexFileName) + ".ts")) {
                        ApexParseListener listenerConverter = new ApexParseListener(
                                file.toAbsolutePath().toString(),
                                tsFileWriter,
                                typeUtils,
                                typeConverterFactory,
                                variableTypeBuilder
                        );

                        listenerConverter.convert();
                    } catch (IOException e) {
                        System.err.println("Error creating TypeScript file: " + e.getMessage());
                    }

                    tsFilesProcessed.add(apexFileName);
                    System.out.println("Done: " + file.toAbsolutePath());
                }
            }
        } catch (IOException e) {
            System.err.println("Error iterating over files: " + e.getMessage());
        }

        try (FileWriter indexFileWriter = FileUtils.getTsFileWriter(outputFolder, "index.ts")) {
            for (String tsFile : tsFilesProcessed) {
                indexFileWriter.write("export * from './" + FileUtils.removeExtension(tsFile) + "';\n");
            }
        } catch (IOException e) {
            System.err.println("Error creating index.ts: " + e.getMessage());
        }

        for (Map.Entry<String, ResolvedTypeInfo> entry : typeResolver.getResolvedTypes().entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue().originalSymbol());
        }
    }
}
