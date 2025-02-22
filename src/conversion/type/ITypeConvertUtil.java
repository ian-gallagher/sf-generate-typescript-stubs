package conversion.type;

import org.antlr.v4.runtime.tree.TerminalNode;
import typeresolution.ResolvedTypeInfo;

import java.util.List;

public interface ITypeConvertUtil {
    ResolvedTypeInfo convertType(String identifier);
    ResolvedTypeInfo convertType(List<TerminalNode> terminalNodes);

}
