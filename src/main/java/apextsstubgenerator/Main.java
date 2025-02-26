package apextsstubgenerator;

import apextsstubgenerator.listeners.ApexParseListenerInput;
import apextsstubgenerator.processing.files.ApexFileProcessor;
import apextsstubgenerator.tsgeneration.type.TypeConverterFactory;
import apextsstubgenerator.tsgeneration.type.TypeUtils;
import apextsstubgenerator.tsgeneration.type.resolution.ITypeResolver;
import apextsstubgenerator.tsgeneration.type.resolution.TypeResolver;
import apextsstubgenerator.tsgeneration.writers.VariableTypeBuilder;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        AppArguments appArguments = HandleArgs.getArgs(args);
        if (appArguments == null) {
            return;
        }

        Path apexFileOrFolderPath = Paths.get(appArguments.inputPath());
        Path apexFolderPath = appArguments.isDirectory() ? apexFileOrFolderPath : apexFileOrFolderPath.getParent();

        ApexParseListenerInput parserListenerInput = getApexParseListenerInput(apexFolderPath);

        new ApexFileProcessor(
                appArguments,
                parserListenerInput
        ).processFiles();
    }

    private static ApexParseListenerInput getApexParseListenerInput(Path apexFolderPath) {
        ITypeResolver typeResolver = new TypeResolver(apexFolderPath);
        TypeUtils typeUtils = new TypeUtils(typeResolver);
        TypeConverterFactory typeConverterFactory = new TypeConverterFactory(typeResolver, typeUtils);
        VariableTypeBuilder variableTypeBuilder = new VariableTypeBuilder(typeConverterFactory, typeUtils);

        return new ApexParseListenerInput(
                typeResolver,
                typeUtils,
                typeConverterFactory,
                variableTypeBuilder
        );
    }
}
