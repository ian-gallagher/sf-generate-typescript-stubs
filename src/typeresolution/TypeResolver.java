package typeresolution;

import listeners.ApexTypeListener;
import parsing.ParseUtils;
import parsing.WalkerAndCompliationUnit;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TypeResolver implements ITypeResolver {
    private final String _apexFilepath;
    private final Map<String, ResolvedTypeInfo> _typeMap = new HashMap<>();

    /**
     * Specify the filepath folder to the apex files
     * @param apexFilepath filepath folder to the apex files
     */
    public TypeResolver(String apexFilepath) {
        this._apexFilepath = apexFilepath;
    }

    public ResolvedTypeInfo resolveType(String symbol) {
        ResolvedTypeInfo resolvedTypeInfo = _typeMap.get(symbol);
        if (resolvedTypeInfo != null) {
            return resolvedTypeInfo;
        }

        String[] parts = symbol.split("\\.");
        String fileName = parts[0] + ".cls";
        File file = new File(_apexFilepath, fileName);

        if (!file.exists()) {
            return new ResolvedTypeInfo();
        }

        try {
            WalkerAndCompliationUnit walkerAndCompliationUnit = ParseUtils.getWalker(file.getAbsolutePath());
            ApexTypeListener listener = new ApexTypeListener(parts[0], parts.length > 1 ? parts[1] : null);

            try {
                walkerAndCompliationUnit.parseTreeWalker.walk(listener, walkerAndCompliationUnit.compilationUnitContext);
            } catch (ApexTypeListener.TypeFoundException e) {
                // Early exit when type is found
                ResolvedTypeInfo newlyResolvedTypeInfo = new ResolvedTypeInfo(file, symbol);
                // TODO maybe the TypeFoundException could return details about the located type based on modifiers etc
                newlyResolvedTypeInfo.resolvedTsSymbol = symbol;
                _typeMap.put(symbol, newlyResolvedTypeInfo);
                return newlyResolvedTypeInfo;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return new ResolvedTypeInfo();
        }

        return new ResolvedTypeInfo();
    }

    public Map<String, ResolvedTypeInfo> getResolvedTypes() {
        return this._typeMap;
    }
}
