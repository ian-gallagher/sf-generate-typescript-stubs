package conversion;

import antlrapex.apexParser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import ts.Writer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class TypeUtils {
    private final Writer _tsTypeWriter;
    private static final Map<String, String> TYPE_MAPPING = new HashMap<>();

    static {
        TYPE_MAPPING.put("String", "string");
        TYPE_MAPPING.put("Integer", "number");
        TYPE_MAPPING.put("Double", "number");
        TYPE_MAPPING.put("Decimal", "number | string");
        TYPE_MAPPING.put("Long", "number");
        TYPE_MAPPING.put("Boolean", "boolean");
        TYPE_MAPPING.put("Object", "object");
        TYPE_MAPPING.put("Id", "string");
        TYPE_MAPPING.put("Date", "string");
        TYPE_MAPPING.put("Datetime", "string");
    }

    public TypeUtils(Writer tsTypeCreator) {
        this._tsTypeWriter = tsTypeCreator;
    }

    public void writeBrackets(apexParser.Type_Context typeContext) {
        if (!typeContext.LBRACK().isEmpty() && !typeContext.RBRACK().isEmpty()) {
            typeContext.children.forEach(child -> {
                if (child instanceof TerminalNode node) {
                    Token token = node.getSymbol();
                    if (token.getType() == apexParser.LBRACK || token.getType() == apexParser.RBRACK) {
                        this.addTypePart(token.getText());
                    }
                }
            });
        }
    }

    public String processTypeIdentifier(List<TerminalNode> terminalNodes) {
        if (terminalNodes.size() == 1) {
            String identifier = terminalNodes.getFirst().getText();

            // handle special case for type Map
            if ("Map".equals(identifier) || "List".equals(identifier)) {
                return identifier;
            } else {
                // if single identifier, I.E. String, Integer, etc we attempt to convert it
                return this.handleIdentifier(identifier);
            }
        } else {
            StringBuilder strBuilder = new StringBuilder();
            // if multiple identifiers, I.E. ParentType.InnerType etc
            for (TerminalNode identifier : terminalNodes) {
                // Parent.InnerCustomType etc
                String identifierText = identifier.getText();
                if (!strBuilder.isEmpty()) {
                    strBuilder.append(".");
                }

                strBuilder.append(identifierText);
            }

            return strBuilder.toString();
        }
    }

    private String handleIdentifier(String identifier) {
        String jsTypeIdentifier = TypeUtils.TYPE_MAPPING.get(identifier);
        if (Objects.isNull(jsTypeIdentifier)) {
            return identifier;
        } else {
            return jsTypeIdentifier;
        }
    }

    public void beginTypePart(String typePart) {
        this._tsTypeWriter.beginLine(typePart);
    }

    public void addTypePart(String typePart) {
        this._tsTypeWriter.concatLine(typePart);
    }
}
