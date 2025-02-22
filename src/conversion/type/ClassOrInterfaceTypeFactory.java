package conversion.type;

import conversion.Writer;

public class ClassOrInterfaceTypeFactory {
    public static IClassOrInterfaceProcessor getConversionWriter(
            String contextType,
            Writer tsTypeWriter,
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
