package taxisong;

public class ShapeMaker implements Shape{
    @Override
    public void draw() {

    }

    public Shape circle;
    public Shape rectangle;
    public Shape square;

    public ShapeMaker(){}
    public void drawCircle(){
        System.out.println("Drawing a Circle");
    }
    public void drawRectangle(){
        System.out.println("Drawing a Rectangle");
    }
    public void drawSquare(){
        System.out.println("Drawing a Square");
    }
}
