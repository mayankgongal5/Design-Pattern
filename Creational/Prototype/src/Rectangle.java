public class Rectangle extends Shap{
    public Rectangle(){
        type = "Rectangle";
    }
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
