package org.gallaghercodedesign.apextsstubgenerator.tsgeneration.type;

import org.gallaghercodedesign.apextsstubgenerator.tsgeneration.type.conversion.ClassOrInterfaceTypeConverter;
import org.gallaghercodedesign.apextsstubgenerator.tsgeneration.type.conversion.ITypeConvertUtil;
import org.gallaghercodedesign.apextsstubgenerator.tsgeneration.type.conversion.PrimitiveTypeConverter;
import org.gallaghercodedesign.apextsstubgenerator.tsgeneration.type.resolution.ITypeResolver;
import org.gallaghercodedesign.apextsstubgenerator.tsgeneration.type.resolution.TypeResolver;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class TypeConverterFactory {
    ITypeResolver _typeResolver;
    Map<String, ITypeConvertUtil> _typeConvertUtils = new HashMap<>();

    public TypeConverterFactory(
            Path apexFilesFolderPath,
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
