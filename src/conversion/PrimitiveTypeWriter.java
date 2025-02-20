package conversion;

import antlrapex.apexParser.VariableDeclaratorsContext;
import antlrapex.apexParser.PrimitiveTypeContext;

import java.util.*;

public class PrimitiveTypeWriter {
    private final TypeUtils _typeUtils;
    private static final Map<String, String> TYPE_MAPPING = new HashMap<>();

    static {
        TYPE_MAPPING.put("byte", "number");
        TYPE_MAPPING.put("short", "number");
        TYPE_MAPPING.put("int", "number");
        TYPE_MAPPING.put("long", "number");
        TYPE_MAPPING.put("float", "number");
        TYPE_MAPPING.put("double", "number");
        TYPE_MAPPING.put("char", "string");
        TYPE_MAPPING.put("boolean", "boolean");
    }

    public PrimitiveTypeWriter(
            TypeUtils typeUtils
    ) {
        this._typeUtils = typeUtils;
    }

    public void process(
            PrimitiveTypeContext primitiveType,
            VariableDeclaratorsContext variableDeclarators
    ) {
        this.getPrintFieldDeclarator(variableDeclarators);
        // get current converted/sanitized type
        String currentConvertedType = this.handleIdentifier(primitiveType.getText());
        this._typeUtils.addTypePart(currentConvertedType);
    }

    /**
     * Iterates over variable declarators and begins the type part. This is the variable name.
     * @param variableDeclarators variableDeclarators context list
     */
    private void getPrintFieldDeclarator(VariableDeclaratorsContext variableDeclarators) {
        String currentIdentifier = variableDeclarators.variableDeclarator(0).getText();
        this._typeUtils.beginTypePart(currentIdentifier + ": ");
    }

    /**
     * Handles the identifier and returns the converted type.
     * @param identifier type identifier
     * @return converted type identifier
     */
    private String handleIdentifier(String identifier) {
        String jsTypeIdentifier = PrimitiveTypeWriter.TYPE_MAPPING.get(identifier.toLowerCase());
        if (Objects.isNull(jsTypeIdentifier)) {
            return identifier;
        } else {
            return jsTypeIdentifier;
        }
    }
}
