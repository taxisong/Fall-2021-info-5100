package taxisong;

public class LuxuryCar extends CarDecorator implements Car{
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        System.out.print(" Adding features of Luxury Car.");
    }
}
