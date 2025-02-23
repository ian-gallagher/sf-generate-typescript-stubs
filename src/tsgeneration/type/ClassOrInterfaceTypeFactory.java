package tsgeneration.type;

import tsgeneration.InterfaceWriter;
import tsgeneration.type.conversion.ITypeConvertUtil;

public class ClassOrInterfaceTypeFactory {
    public static IClassOrInterfaceProcessor getConversionWriter(
            String contextType,
            InterfaceWriter tsTypeWriter,
            TypeUtils typeUtils,
            ITypeConvertUtil typeConvertUtil
    ) {
        if (contextType.equals("Map")) {
            return new MapClassType(tsTypeWriter, typeConvertUtil, typeUtils);
        } else {
            return new NonMapClassType(tsTypeWriter, typeConvertUtil, typeUtils);
        }
    }
}
