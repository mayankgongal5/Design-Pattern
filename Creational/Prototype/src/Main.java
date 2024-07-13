public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ShapeCache.loadCache();
        Shap clonedShape = (Shap) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape.getType());
        Shap clonedShape2 = (Shap) ShapeCache.getShape("2");
        System.out.println("Shape : " + clonedShape2.getType());
        Shap clonedShape3 = (Shap) ShapeCache.getShape("3");
        System.out.println("Shape : " + clonedShape3.getType());
    }
}