public class factory_class {
public static Shape getShape(String Shape){
    if (Shape.isEmpty()){
        return null;
    }
    else if (Shape.equalsIgnoreCase("Circle")){
        return new circle();
    }
    else if (Shape.equalsIgnoreCase("Triangle")){
        return new triangle();
    }
    else if (Shape.equalsIgnoreCase("rectangle")){
        return new Rectangle();
    }
    return null;
}
}
