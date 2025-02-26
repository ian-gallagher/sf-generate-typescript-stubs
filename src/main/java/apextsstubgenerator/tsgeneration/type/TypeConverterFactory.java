package apextsstubgenerator.tsgeneration.type;

import apextsstubgenerator.tsgeneration.type.conversion.ClassOrInterfaceTypeConverter;
import apextsstubgenerator.tsgeneration.type.conversion.ITypeConvertUtil;
import apextsstubgenerator.tsgeneration.type.conversion.PrimitiveTypeConverter;
import apextsstubgenerator.tsgeneration.type.resolution.ITypeResolver;

import java.util.HashMap;
import java.util.Map;

public class TypeConverterFactory {
    ITypeResolver _typeResolver;
    Map<String, ITypeConvertUtil> _typeConvertUtils = new HashMap<>();

    public TypeConverterFactory(
            ITypeResolver typeResolver,
            TypeUtils typeUtils
    ) {
        this._typeResolver = typeResolver;
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
