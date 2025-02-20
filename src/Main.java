import listeners.ApexParseListener;
import java.nio.file.*;
import java.io.IOException;
import apex.FileIterator;
import conversion.writers.ClassOrInterfaceWriter;
import conversion.writers.PrimitiveTypeWriter;
import conversion.type.TypeUtils;
import settings.Provider;
import conversion.Creator;
import conversion.Writer;
import utils.FileUtils;

public class Main {
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

        try (FileIterator fileIterator = new FileIterator(apexCodeFolderPath, "cls")) {
            while (fileIterator.hasNext()) {
                Path file = fileIterator.next();
                if (Files.isRegularFile(file)) { // Ensure it's a regular file
                    String apexFileName = file.getFileName().toString();
                    String apexFilePath = apexCodeFolderPath + apexFileName;

                    // this writer will be used to write the TypeScript code to the output file
                    Writer writer = FileUtils.createFileWriter(apexFileName);
                    TypeUtils typeUtils = new TypeUtils(writer);

                    ApexParseListener converter = new ApexParseListener(
                            apexFileName,
                            apexCodeFolderPath,
                            new Creator(
                                    writer,
                                    new ClassOrInterfaceWriter(typeUtils, writer),
                                    new PrimitiveTypeWriter(typeUtils)
                            )
                    );
                    converter.convert();

                    System.out.println("Processed file: " + apexFilePath);
                }
            }
        } catch (IOException e) {
            System.err.println("Error iterating over files: " + e.getMessage());
        }
    }
}
