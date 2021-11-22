package taxisong;

public class CarDecorator implements Car {
    @Override
    public void assemble() {}

    public CarDecorator(Car car){
        car.assemble();
    }
}
