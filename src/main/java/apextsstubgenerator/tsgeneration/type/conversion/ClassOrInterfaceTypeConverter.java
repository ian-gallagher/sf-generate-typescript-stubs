package apextsstubgenerator.tsgeneration.type.conversion;

import apextsstubgenerator.tsgeneration.type.TypeUtils;
import org.antlr.v4.runtime.tree.TerminalNode;
import apextsstubgenerator.tsgeneration.type.resolution.ITypeResolver;
import apextsstubgenerator.tsgeneration.type.resolution.ResolvedTypeInfo;

import java.util.*;

public class ClassOrInterfaceTypeConverter implements ITypeConvertUtil {
    private final ITypeResolver _typeResolver;
    private final TypeUtils _typeUtils;
    private final List<ResolvedTypeInfo> _externalTypes = new ArrayList<>();
    private static final Map<String, String> CLASSORINTERFACE_TYPES = new HashMap<>();

    static {
        CLASSORINTERFACE_TYPES.put("String", "string");
        CLASSORINTERFACE_TYPES.put("Integer", "number");
        CLASSORINTERFACE_TYPES.put("Double", "number");
        CLASSORINTERFACE_TYPES.put("Decimal", "number | string");
        CLASSORINTERFACE_TYPES.put("Long", "number");
        CLASSORINTERFACE_TYPES.put("Boolean", "boolean");
        CLASSORINTERFACE_TYPES.put("Object", "object");
        CLASSORINTERFACE_TYPES.put("Id", "string");
        CLASSORINTERFACE_TYPES.put("Date", "string");
        CLASSORINTERFACE_TYPES.put("Datetime", "string");
    }

    public ClassOrInterfaceTypeConverter(ITypeResolver typeResolver, TypeUtils typeUtils) {
        this._typeResolver = typeResolver;
        this._typeUtils = typeUtils;
    }

    public ResolvedTypeInfo convertType(List<TerminalNode> terminalNodes) {
        String identifier = this._typeUtils.processIdentifier(terminalNodes);
        return this.convertType(identifier);
    }

    public ResolvedTypeInfo convertType(String identifier) {
        return this.processTypeOrIdentifier(identifier);
    }

    public String flushImports() {
        StringBuilder imports = new StringBuilder();
        for (ResolvedTypeInfo externalType : this._externalTypes) {
            imports.append("import { ").append(externalType.getTsSymbol()).append(" } from './").append(externalType.importPath()).append("';\n");
        }

        this._externalTypes.clear();
        return imports.toString();
    }

    /**
     * Converts the identifier to a type.
     * @param identifier variable type identifier
     * @return type information details
     */
    public ResolvedTypeInfo processTypeOrIdentifier(String identifier) {
        if (!identifier.contains(".")) {
            // don't attempt to convert Map or List
            if ("Map".equals(identifier) || "List".equals(identifier)) {
                return this._typeUtils.buildResolvedTypeObject(identifier);
            } else {
                // if single identifier, I.E. String, Integer, etc we attempt to convert it
                return this.convertToTsType(identifier);
            }
        } else {
            // if multiple identifiers, I.E. ParentType.InnerType etc
            return this.attemptResolveType(identifier);
        }
    }

    private ResolvedTypeInfo convertToTsType(String identifier) {
        String jsTypeIdentifier = CLASSORINTERFACE_TYPES.get(identifier);
        if (Objects.isNull(jsTypeIdentifier)) {
            return this.attemptResolveType(identifier);
        } else {
            return this._typeUtils.buildResolvedTypeObject(jsTypeIdentifier);
        }
    }

    /**
     * Handles the identifier and returns the converted type
     * @param identifier variable type identifier
     * @return type information details
     */
    private ResolvedTypeInfo attemptResolveType(String identifier) {
        // attempt to resolve the type
        ResolvedTypeInfo resolvedTypeInfo = this._typeResolver.resolveType(identifier);
        if (resolvedTypeInfo.isExternal() && !this.hasResolvedExternalType(resolvedTypeInfo)) {
            this._externalTypes.add(resolvedTypeInfo);
        }

        return resolvedTypeInfo;
    }

    private Boolean hasResolvedExternalType(ResolvedTypeInfo currentType) {
        for (ResolvedTypeInfo resolvedTypeInfo : this._externalTypes) {
            if (resolvedTypeInfo.getTsSymbol().equals(currentType.getTsSymbol())) {
                return true;
            }
        }

        return false;
    }
}
