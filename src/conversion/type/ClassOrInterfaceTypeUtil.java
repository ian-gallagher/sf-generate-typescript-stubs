package conversion.type;

import org.antlr.v4.runtime.tree.TerminalNode;
import typeresolution.ITypeResolver;
import typeresolution.ResolvedTypeInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ClassOrInterfaceTypeUtil implements ITypeConvertUtil {
    private final ITypeResolver _typeResolver;
    private final TypeUtils _typeUtils;
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

    public ClassOrInterfaceTypeUtil(ITypeResolver typeResolver, TypeUtils typeUtils) {
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

    /**
     * Converts the identifier to a type.
     * @param identifier
     * @return
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
     * @param identifier
     * @return
     */
    private ResolvedTypeInfo attemptResolveType(String identifier) {
        // attempt to resolve the type
        return this._typeResolver.resolveType(identifier);
    }


}
