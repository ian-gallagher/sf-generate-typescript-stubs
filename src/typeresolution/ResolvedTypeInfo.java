package typeresolution;

import java.io.File;

public class ResolvedTypeInfo {
    public ResolvedTypeInfo() {
    }

    public ResolvedTypeInfo(File file, String symbol) {
        this.file = file;
        this.symbol = symbol;
        this.isResolved = true;
    }

    public File file;
    public String symbol;
    public String resolvedTsSymbol;
    public Boolean isResolved = false;
}
