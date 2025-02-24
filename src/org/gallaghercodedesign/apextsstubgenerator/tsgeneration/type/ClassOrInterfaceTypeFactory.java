package org.gallaghercodedesign.apextsstubgenerator.tsgeneration.type;

import org.gallaghercodedesign.apextsstubgenerator.tsgeneration.type.conversion.ITypeConvertUtil;

public class ClassOrInterfaceTypeFactory {
    public static IClassOrInterfaceProcessor getConversionWriter(
            String contextType,
            TypeUtils typeUtils,
            ITypeConvertUtil typeConvertUtil
    ) {
        if (contextType.equals("Map")) {
            return new MapClassType(typeConvertUtil, typeUtils);
        } else {
            return new NonMapClassType(typeConvertUtil, typeUtils);
        }
    }
}
