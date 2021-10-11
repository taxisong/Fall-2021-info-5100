package taxisong;

public class Shape {
    public String name;
    public String color;
    public int area;
    public int perimeter;


//    setter
    public Shape(String name , String color){
        this.name = name;
        this.color = color;
    }

    public Shape(String name , String color , int perimeter , int area){
        this.name = name;
        this.color = color;
        this.perimeter = perimeter;
        this.area = area;
    }

    public Shape() {
    }

    //    getter
    public String getName(){
        return name;
    }

    public String getColor(){
        return color;
    }

    public int getArea(){
        return area;
    }

    public int getPerimeter(){
        return perimeter;
    }

    //    method
    public String printShape(){
        String shape = "The " + name + " has a " + color + " color";
        return shape;
    }

}


