package org.gallaghercodedesign.apextsstubgenerator.tsgeneration.type.conversion;

import org.gallaghercodedesign.apextsstubgenerator.tsgeneration.type.TypeUtils;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.gallaghercodedesign.apextsstubgenerator.tsgeneration.type.resolution.ResolvedTypeInfo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrimitiveTypeConverter implements ITypeConvertUtil {
    private final TypeUtils _typeUtils;
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

    public PrimitiveTypeConverter(TypeUtils typeUtils) {
        this._typeUtils = typeUtils;
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
            return new ResolvedTypeInfo(identifier);
        }
    }

    @Override
    public String flushImports() {
        return null;
    }
}
