package org.gallaghercodedesign.apextsstubgenerator;

import org.gallaghercodedesign.apextsstubgenerator.apex.FileIterator;
import org.gallaghercodedesign.apextsstubgenerator.listeners.ApexParseListener;
import org.gallaghercodedesign.apextsstubgenerator.tsgeneration.type.TypeConverterFactory;
import org.gallaghercodedesign.apextsstubgenerator.tsgeneration.type.TypeUtils;
import org.gallaghercodedesign.apextsstubgenerator.tsgeneration.type.resolution.ITypeResolver;
import org.gallaghercodedesign.apextsstubgenerator.tsgeneration.type.resolution.ResolvedTypeInfo;
import org.gallaghercodedesign.apextsstubgenerator.tsgeneration.type.resolution.TypeResolver;
import org.gallaghercodedesign.apextsstubgenerator.tsgeneration.writers.VariableTypeBuilder;
import org.gallaghercodedesign.apextsstubgenerator.utils.FileUtils;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    private final static String OUTPUT_TYPES_FOLDER = "output/types/";
    private final static List<String> tsFilesProcessed = new ArrayList<>();

    public static void main(String[] args) {
        String outputFolder = args.length == 2 ? args[1] : OUTPUT_TYPES_FOLDER;
        Path apexCodeFolderPath;
        // Check if the folder path is provided as a command-line argument
        if (args.length > 0) {
            String userInputFolder = args[0];
            apexCodeFolderPath = Paths.get(userInputFolder);
            if (!Files.isDirectory(apexCodeFolderPath)) {
                throw new IllegalArgumentException("The specified path is not a directory: " + userInputFolder + ". Resolved to: " + apexCodeFolderPath);
            }
        } else {
            throw new IllegalArgumentException("Please provide the folder path to the Apex code.");
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
                    Path fullPath = Paths.get(apexCodeFolderPath.toString()).resolve(apexFileName);

                    try (FileWriter tsFileWriter = FileUtils.getTsFileWriter(outputFolder, FileUtils.removeExtension(apexFileName) + ".ts")) {
                        ApexParseListener listenerConverter = new ApexParseListener(
                                fullPath.toAbsolutePath().toString(),
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
                    System.out.println("Processed file: " + fullPath);
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
