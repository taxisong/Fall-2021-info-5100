package taxisong;

public class Square extends Shape{
    public int side;

//    setter
    public Square(int side){
        this.side = side;
    }

    public Square(String name , String color , int side){
        this.name = name;
        this.color = color;
        this.side = side;
    }

//    getter
    public int getSide(){
        return side;
    }

    public int getArea(){
        super.getArea();
        area = side * side;
        return area;
    }

    public int getPerimeter(){
        super.getPerimeter();
        perimeter = 4 * side;
        return perimeter;
    }

}
