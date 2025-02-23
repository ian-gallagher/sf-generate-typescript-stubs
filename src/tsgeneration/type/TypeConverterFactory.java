package tsgeneration.type;

import tsgeneration.type.conversion.ClassOrInterfaceTypeConverter;
import tsgeneration.type.conversion.ITypeConvertUtil;
import tsgeneration.type.conversion.PrimitiveTypeConverter;
import tsgeneration.type.resolution.ITypeResolver;
import tsgeneration.type.resolution.TypeResolver;

import java.util.HashMap;
import java.util.Map;

public class TypeConverterFactory {
    ITypeResolver _typeResolver;
    Map<String, ITypeConvertUtil> _typeConvertUtils = new HashMap<>();

    public TypeConverterFactory(
            String apexFilesFolderPath,
            TypeUtils typeUtils
    ) {
        this._typeResolver = new TypeResolver(apexFilesFolderPath);
        this._typeConvertUtils.put("ClassOrInterface", new ClassOrInterfaceTypeConverter(this._typeResolver, typeUtils));
        this._typeConvertUtils.put("Primitive", new PrimitiveTypeConverter(typeUtils));
    }

    public ITypeConvertUtil getTypeConverter(
            String contextType
    ) {
        if (contextType.equals("PrimitiveType")) {
            return this._typeConvertUtils.get("Primitive");
        } else {
            return this._typeConvertUtils.get("ClassOrInterface");
        }
    }
}
