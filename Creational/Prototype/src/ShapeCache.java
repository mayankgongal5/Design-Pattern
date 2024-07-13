
import java.util.*;
public class ShapeCache {
    private static Map<String, Shap> shapeMap = new HashMap<String, Shap>();

    public static Shap getShape(String shapeId) {
        Shap cachedShape = shapeMap.get(shapeId);
        return (Shap) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(), square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
