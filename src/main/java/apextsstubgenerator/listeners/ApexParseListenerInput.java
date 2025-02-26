package apextsstubgenerator.listeners;

import apextsstubgenerator.tsgeneration.type.TypeConverterFactory;
import apextsstubgenerator.tsgeneration.type.TypeUtils;
import apextsstubgenerator.tsgeneration.type.resolution.ITypeResolver;
import apextsstubgenerator.tsgeneration.writers.VariableTypeBuilder;

import java.nio.file.Path;

public class ApexParseListenerInput {
    private Path _inputFilePath;
    private Path _outputFolder;
    private final ITypeResolver _typeResolver;
    private final TypeUtils _typeUtils;
    private final TypeConverterFactory _typeConverterFactory;
    private final VariableTypeBuilder _variableTypeBuilder;

    public ApexParseListenerInput(
            ITypeResolver typeResolver,
            TypeUtils typeUtils,
            TypeConverterFactory typeConverterFactory,
            VariableTypeBuilder variableTypeBuilder
    ) {
        this._typeResolver = typeResolver;
        this._typeUtils = typeUtils;
        this._typeConverterFactory = typeConverterFactory;
        this._variableTypeBuilder = variableTypeBuilder;
    }

    public ITypeResolver getTypeResolver() {
        return this._typeResolver;
    }

    public void setInputPath(Path inputFilePath) {
        this._inputFilePath = inputFilePath;
    }

    public Path getInputPath() {
        return this._inputFilePath;
    }

    public void setOutputFolder(Path outputFolder) {
        this._outputFolder = outputFolder;
    }

    public Path getOutputFolder() {
        return this._outputFolder;
    }

    public TypeUtils getTypeUtils() {
        return this._typeUtils;
    }

    public TypeConverterFactory getTypeConverterFactory() {
        return this._typeConverterFactory;
    }

    public VariableTypeBuilder getVariableTypeBuilder() {
        return this._variableTypeBuilder;
    }
}
