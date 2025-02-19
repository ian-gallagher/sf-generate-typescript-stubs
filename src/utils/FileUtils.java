package utils;

import ts.Writer;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtils {
    public static String removeExtension(String fileName) {
        int lastDotIndex = fileName.lastIndexOf('.');
        if (lastDotIndex == -1) {
            return fileName; // No extension found
        }
        return fileName.substring(0, lastDotIndex);
    }

    public static Writer createFileWriter(String fileName) {
        String fileFolder = "output/types/";
        String fileNameAndPath = fileFolder + removeExtension(fileName) + ".ts";
        FileUtils.ensureDirectoryExists(fileFolder);

        try {
            return new Writer(new FileWriter(fileNameAndPath));
        } catch (IOException e) {
            throw new RuntimeException("Failed to create TypeScript file for " + fileNameAndPath);
        }
    }

    private static void ensureDirectoryExists(String directoryPath) {
        Path path = Paths.get(directoryPath);
        if (!Files.exists(path)) {
            try {
                Files.createDirectories(path);
            } catch (IOException e) {
                throw new RuntimeException("Failed to create directory: " + directoryPath, e);
            }
        }
    }
}
