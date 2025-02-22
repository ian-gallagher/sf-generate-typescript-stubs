package conversion.type;

import antlrapex.apexParser;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import typeresolution.ITypeResolver;
import typeresolution.ResolvedTypeInfo;

import java.util.List;

public class TypeUtils {
    ITypeResolver _typeResolver;

    public TypeUtils(
            ITypeResolver typeConvertUtil
    ) {
        this._typeResolver = typeConvertUtil;
    }

    public ResolvedTypeInfo buildResolvedTypeObject(String identifier) {
        ResolvedTypeInfo resolvedType = new ResolvedTypeInfo();
        resolvedType.symbol = identifier;
        resolvedType.resolvedTsSymbol = identifier;
        resolvedType.isResolved = true;
        return resolvedType;
    }

    public String buildBrackets(apexParser.Type_Context typeContext) {
        StringBuilder bracketsBuilder = new StringBuilder();

        if (!typeContext.LBRACK().isEmpty() && !typeContext.RBRACK().isEmpty()) {
            typeContext.children.forEach(child -> {
                if (child instanceof TerminalNode node) {
                    Token token = node.getSymbol();
                    if (token.getType() == apexParser.LBRACK || token.getType() == apexParser.RBRACK) {
                        bracketsBuilder.append(token.getText());
                    }
                }
            });
        }

        return bracketsBuilder.toString();
    }

    public String processIdentifier(List<TerminalNode> terminalNodes) {
        if (terminalNodes.size() == 1) {
            return terminalNodes.getFirst().getText();
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
}
