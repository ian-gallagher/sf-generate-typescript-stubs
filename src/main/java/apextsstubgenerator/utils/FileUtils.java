package apextsstubgenerator.utils;

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

    public static FileWriter getTsFileWriter(String fileFolder, String fileName) {
        String fileNameAndPath = fileFolder + fileName;
        FileUtils.ensureDirectoryExists(fileFolder);

        try {
            return new FileWriter(fileNameAndPath);
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
