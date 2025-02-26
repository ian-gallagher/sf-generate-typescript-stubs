package apextsstubgenerator.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileUtils {
    public static String getRelativeImportPath(Path basePath, Path filePath) {
        Path relativePath = basePath.relativize(filePath);
        // Remove the file extension
        String fileName = relativePath.toString();
        String fileNameWithoutExtension = fileName.substring(0, fileName.lastIndexOf('.'));

        // Prepend "./" to the result
        return "./" + fileNameWithoutExtension;
    }

    public static String removeExtension(String fileName) {
        int lastDotIndex = fileName.lastIndexOf('.');
        if (lastDotIndex == -1) {
            return fileName; // No extension found
        }
        return fileName.substring(0, lastDotIndex);
    }

    public static FileWriter getTsFileWriter(String fileFolder, String fileName) {
        FileUtils.ensureDirectoryExists(fileFolder);

        Path finalFilePath = Paths.get(fileFolder, fileName);

        try {
            return new FileWriter(finalFilePath.toString());
        } catch (IOException e) {
            throw new RuntimeException("Failed to create TypeScript file for " + e.getMessage());
        }
    }

    public static void ensureDirectoryExists(String directoryPath) {
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
