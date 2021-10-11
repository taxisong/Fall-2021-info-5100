package taxisong;

public class Rectangle extends Shape{
    public int width;
    public int height;



//    setter
    public Rectangle(int side){
        this.width = side;
        this.height = side;
    }

    public Rectangle(int width , int height){
        this.width = width;
        this.height = height;
    }

    public Rectangle(String name , String color , int width , int height){
        this.name = name;
        this.color = color;
        this.width = width;
        this.height = height;
    }

//    getter
    public int getWidth(){
        return width;
    }

    public  int getHeight(){
        return  height;
    }

    public int getArea(){
        super.getArea();
        area = width * height;
        return area;
    }

    public int getPerimeter(){
        super.getPerimeter();
        perimeter = 2 * width + 2 * height;
        return perimeter;
    }

}
