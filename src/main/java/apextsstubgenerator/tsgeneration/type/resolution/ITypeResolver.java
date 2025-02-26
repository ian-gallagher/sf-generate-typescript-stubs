package apextsstubgenerator.tsgeneration.type.resolution;

import java.util.Map;

public interface ITypeResolver {
    ResolvedTypeInfo resolveType(String symbol);
    Map<String, ResolvedTypeInfo> flushResolvedTypes();
}
