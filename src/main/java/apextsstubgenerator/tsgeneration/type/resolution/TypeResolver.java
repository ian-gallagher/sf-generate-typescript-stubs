package apextsstubgenerator.tsgeneration.type.resolution;

import apextsstubgenerator.apex.FileIterator;
import apextsstubgenerator.listeners.ApexTypeListener;
import apextsstubgenerator.parsing.ParseUtils;
import apextsstubgenerator.parsing.WalkerAndCompilationUnit;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class TypeResolver implements ITypeResolver {
    private final Path _apexFolderPath;
    private final Map<String, ResolvedTypeInfo> _typeMap = new HashMap<>();

    /**
     * Specify the filepath folder to the apex files
     * @param apexFilepath filepath folder to the apex files
     */
    public TypeResolver(Path apexFilepath) {
        this._apexFolderPath = apexFilepath;
    }

    public ResolvedTypeInfo resolveType(String symbol) {
        ResolvedTypeInfo resolvedTypeInfo = this._typeMap.get(symbol);

        if (resolvedTypeInfo != null) {
            return resolvedTypeInfo;
        }

        String[] parts = symbol.split("\\.");
        String fileName = parts[0] + ".cls";
        File file = new File(this._apexFolderPath.normalize().toFile(), fileName);

        if (!file.exists()) {
            // expand search for type to all apex files
            return this.scanAllFiles(symbol, parts);
        }

        return this.locateTypeInFile(symbol, parts, file);
    }

    private ResolvedTypeInfo scanAllFiles(String symbol, String[] parts) {
        try (FileIterator fileIterator = new FileIterator(this._apexFolderPath.normalize(), "cls")) {
            while (fileIterator.hasNext()) {
                Path filePath = fileIterator.next();
                if (Files.isRegularFile(filePath)) {
                    ResolvedTypeInfo resolvedTypeInfo = this.locateTypeInFile(symbol, parts, filePath.toFile());
                    if (resolvedTypeInfo != null) {
                        this._typeMap.put(symbol, resolvedTypeInfo);
                        return resolvedTypeInfo;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error scanning files for type: " + e.getMessage());
        }

        return null;
    }

    private ResolvedTypeInfo locateTypeInFile(String symbol, String[] parts, File file) {
        try {
            WalkerAndCompilationUnit walkerAndCompilationUnit = ParseUtils.getWalker(file.getAbsolutePath());
            ApexTypeListener listener = new ApexTypeListener(parts[0], parts.length > 1 ? parts[1] : null);

            try {
                walkerAndCompilationUnit.parseTreeWalker.walk(listener, walkerAndCompilationUnit.compilationUnitContext);
            } catch (ApexTypeListener.TypeFoundException e) {
                // Early exit when type is found
                ResolvedTypeInfo newlyResolvedTypeInfo = new ResolvedTypeInfo(file, parts, symbol);
                // TODO maybe the TypeFoundException could return details about the located type based on modifiers etc
                newlyResolvedTypeInfo.resolvedTsSymbol = symbol;
                this._typeMap.put(symbol, newlyResolvedTypeInfo);
                return newlyResolvedTypeInfo;
            }
        } catch (IOException e) {
            System.out.println("Error resolving type: " + e.getMessage());
            return null;
        }

        return null;
    }

    public Map<String, ResolvedTypeInfo> getResolvedTypes() {
        return this._typeMap;
    }
}
