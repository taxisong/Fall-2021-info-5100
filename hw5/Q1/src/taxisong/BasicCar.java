package taxisong;

public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.print("Basic Car.");
    }

    public BasicCar(){ }
}//end of BasicCar
