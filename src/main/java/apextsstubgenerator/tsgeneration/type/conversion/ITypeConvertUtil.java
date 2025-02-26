package apextsstubgenerator.tsgeneration.type.conversion;

import org.antlr.v4.runtime.tree.TerminalNode;
import apextsstubgenerator.tsgeneration.type.resolution.ResolvedTypeInfo;

import java.util.List;

public interface ITypeConvertUtil {
    ResolvedTypeInfo convertType(String identifier);
    ResolvedTypeInfo convertType(List<TerminalNode> terminalNodes);
    String flushImports();
}
