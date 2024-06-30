public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){

        return null;
    }
    @Override
    Colors getColors(String color) {
         if(color == null){
            return null;
        }
        if (color.equalsIgnoreCase("Red")){
            return new Red();
        }
        else if (color.equalsIgnoreCase("Blue")){
            return new Blue();
        }
        else if (color.equalsIgnoreCase("Green")){
            return new Green();
        }
        return null;
    }

}
