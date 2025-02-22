package conversion.type;

import org.antlr.v4.runtime.tree.TerminalNode;
import typeresolution.ITypeResolver;
import typeresolution.ResolvedTypeInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrimitiveTypeUtil implements ITypeConvertUtil {
    private final TypeUtils _typeUtils;
    private final ITypeResolver _typeResolver;
    private static final Map<String, String> PRIMITIVE_TYPES = new HashMap<>();

    static {
        PRIMITIVE_TYPES.put("byte", "number");
        PRIMITIVE_TYPES.put("short", "number");
        PRIMITIVE_TYPES.put("int", "number");
        PRIMITIVE_TYPES.put("long", "number");
        PRIMITIVE_TYPES.put("float", "number");
        PRIMITIVE_TYPES.put("double", "number");
        PRIMITIVE_TYPES.put("char", "string");
        PRIMITIVE_TYPES.put("boolean", "boolean");
    }

    public PrimitiveTypeUtil(ITypeResolver typeResolver, TypeUtils typeUtils) {
        this._typeUtils = typeUtils;
        this._typeResolver = typeResolver;
    }

    public ResolvedTypeInfo convertType(List<TerminalNode> terminalNodes) {
        String identifier = this._typeUtils.processIdentifier(terminalNodes);
        return this.convertType(identifier);
    }

    /**
     * Handles the identifier and returns the converted type.
     * @param identifier type identifier
     * @return converted type identifier
     */
    public ResolvedTypeInfo convertType(String identifier) {
        String jsTypeIdentifier = PRIMITIVE_TYPES.get(identifier.toLowerCase());
        if (jsTypeIdentifier != null) {
            return this._typeUtils.buildResolvedTypeObject(jsTypeIdentifier);
        } else {
            // attempt to resolve the type
            ResolvedTypeInfo resolvedTypeInfo = this._typeResolver.resolveType(identifier);
            if (resolvedTypeInfo.isResolved) {
                return resolvedTypeInfo;
            }

            return this._typeUtils.buildResolvedTypeObject(identifier);
        }
    }
}
