import tsgeneration.type.*;
import listeners.ApexParseListener;

import java.io.FileWriter;
import java.nio.file.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import apex.FileIterator;
import settings.Provider;
import tsgeneration.type.resolution.ITypeResolver;
import tsgeneration.type.resolution.ResolvedTypeInfo;
import tsgeneration.type.resolution.TypeResolver;
import tsgeneration.writers.VariableTypeBuilder;
import utils.FileUtils;

public class Main {
    private final static List<String> tsFilesProcessed = new ArrayList<>();

    public static void main(String[] args) {
        String apexCodeFolderPath;
        Provider settingsProvider = new Provider();
        // Check if the folder path is provided as a command-line argument
        if (args.length > 0) {
            apexCodeFolderPath = args[0];
        } else {
            // Read the folder path from a settings file or as an input argument
            apexCodeFolderPath = settingsProvider.apexCodeFolderPath();
        }

        ITypeResolver typeResolver = new TypeResolver(apexCodeFolderPath);
        TypeUtils typeUtils = new TypeUtils(typeResolver);
        TypeConverterFactory typeConverterFactory = new TypeConverterFactory(apexCodeFolderPath, typeUtils);
        VariableTypeBuilder variableTypeBuilder = new VariableTypeBuilder(typeConverterFactory, typeUtils);

        try (FileIterator fileIterator = new FileIterator(apexCodeFolderPath, "cls")) {
            while (fileIterator.hasNext()) {
                Path file = fileIterator.next();
                if (Files.isRegularFile(file)) { // Ensure it's a regular file
                    String apexFileName = file.getFileName().toString();
                    String apexFilePath = apexCodeFolderPath + apexFileName;

                    try (FileWriter tsFileWriter = FileUtils.getTsFileWriter(FileUtils.removeExtension(apexFileName) + ".ts")) {
                        ApexParseListener listenerConverter = new ApexParseListener(
                                apexFilePath,
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
                    System.out.println("Processed file: " + apexFilePath);
                }
            }
        } catch (IOException e) {
            System.err.println("Error iterating over files: " + e.getMessage());
        }

        try (FileWriter indexFileWriter = FileUtils.getTsFileWriter("index.ts")) {
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
