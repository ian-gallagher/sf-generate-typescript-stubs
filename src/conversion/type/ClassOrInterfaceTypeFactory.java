package conversion.type;

public class ClassOrInterfaceTypeFactory {
    public static IClassOrInterfaceProcessor getConversionWriter(
            String contextType,
            TypeUtils typeUtils
    ) {
        if (contextType.equals("Map")) {
            return new MapClassType(typeUtils);
        } else {
            return new NonMapClassType(typeUtils);
        }
    }
}
