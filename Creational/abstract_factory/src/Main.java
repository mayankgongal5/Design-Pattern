public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        AbstractFactory colorFactory= FactoryProducer.getFactory("Color");
        assert shapeFactory != null;
        assert colorFactory != null;
        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("Rectangle");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("square");
        shape3.draw();
        Colors color1 = colorFactory.getColors("RED");
        color1.fill();
         Colors color2 = colorFactory.getColors("Blue");
        color2.fill();
         Colors color3 = colorFactory.getColors("Green");
        color3.fill();

    }
}