package apextsstubgenerator.tsgeneration.type;

import apextsstubgenerator.antlrapex.apexParser;
import apextsstubgenerator.antlrapex.apexParser.VariableDeclaratorsContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import apextsstubgenerator.tsgeneration.type.resolution.ITypeResolver;
import apextsstubgenerator.tsgeneration.type.resolution.ResolvedTypeInfo;

import java.util.List;

public class TypeUtils {
    ITypeResolver _typeResolver;

    public TypeUtils(
            ITypeResolver typeConvertUtil
    ) {
        this._typeResolver = typeConvertUtil;
    }

    public ResolvedTypeInfo buildResolvedTypeObject(String identifier) {
        return new ResolvedTypeInfo(identifier);
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

    /**
     * Iterates over variable declarators and begins the type part. This is the variable name.
     * @param variableDeclarators variableDeclarators context list
     */
    public String processVariableDeclarators(VariableDeclaratorsContext variableDeclarators) {
        int variableDeclaratorCount = variableDeclarators.variableDeclarator().size();

        StringBuilder strBuilder = new StringBuilder();

        for (int i = 0; i < variableDeclaratorCount; i++) {
            apexParser.VariableDeclaratorContext variableDeclarator = variableDeclarators.variableDeclarator(i);
            if (strBuilder.isEmpty()) {
                strBuilder.append(variableDeclarator.variableDeclaratorId().getText());
            } else {
                strBuilder.append(variableDeclarator.variableDeclaratorId().getText());
            }
        }

        return strBuilder.toString();
    }
}
