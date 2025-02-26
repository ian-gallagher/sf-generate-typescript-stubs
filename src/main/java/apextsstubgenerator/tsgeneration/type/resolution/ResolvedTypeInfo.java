package apextsstubgenerator.tsgeneration.type.resolution;

import apextsstubgenerator.utils.FileUtils;

import java.io.File;

public class ResolvedTypeInfo {
    private File file;
    private String[] parts;
    private String _originalSymbol;
    public String resolvedTsSymbol;
    public Boolean isResolved = false;

    public ResolvedTypeInfo() {
    }

    public ResolvedTypeInfo(String identifier) {
        this._originalSymbol = identifier;
        this.parts = identifier.split("\\.");
        this.resolvedTsSymbol = identifier;
        this.isResolved = true;
    }

    public ResolvedTypeInfo(File file, String[] parts, String originalSymbol) {
        this.file = file;
        this.parts = parts;
        this._originalSymbol = originalSymbol;
        this.isResolved = true;
    }

    public String importPath() {
        return FileUtils.removeExtension(this.file.getName());
    }

    public Boolean isExternal() {
        return this.file != null && this.file.exists();
    }

    public String getTsSymbol() {
        if (this.isExternal() && this.parts.length > 1) {
            return this.parts[1];
        } else {
            return this._originalSymbol;
        }
    }

    public File getFile() {
        return this.file;
    }

    public String originalSymbol() {
        return this._originalSymbol;
    }
}
