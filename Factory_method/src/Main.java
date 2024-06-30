

public class Main {
    public static void main(String[] args) {

        factory_class fac = new factory_class();
        Shape Circle = fac.getShape("Circle");
        Circle.draw();
        Shape Rect = fac.getShape("Rectangle");
        Rect.draw();
        Shape Tri = fac.getShape("Triangle");
        Tri.draw();
        asdas


    }

}