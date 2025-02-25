package apextsstubgenerator;

import org.apache.commons.cli.*;

public class HandleArgs {
    public static AppArguments getArgs(String[] args) {
        Options options = new Options();
        options.addOption("f", "file", true, "Path to the file");
        options.addOption("d", "directory", true, "Path to the directory");
        options.addOption("o", "output", true, "Path to output ts files to");

        CommandLineParser parser = new DefaultParser();
        try {
            CommandLine cmd = parser.parse(options, args);
            String inputPath;
            boolean inputPathIsFolder;

            if (cmd.hasOption("f")) {
                inputPathIsFolder = false;
                inputPath = cmd.getOptionValue("f");
            } else if (cmd.hasOption("d")) {
                inputPathIsFolder = true;
                inputPath = cmd.getOptionValue("d");
            } else {
                System.err.println("Error: No valid option provided. Use -f or -d.");
                return null;
            }

            AppArguments appArgs = new AppArguments(inputPath, inputPathIsFolder);

            if (cmd.hasOption("o")) {
                appArgs.setTsOutputPath(cmd.getOptionValue("o"));
            }

            return appArgs;
        } catch (ParseException e) {
            System.err.println("Error parsing command-line arguments: " + e.getMessage());
        }

        return null;
    }
}
