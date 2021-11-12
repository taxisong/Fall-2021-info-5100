package taxisong;

public class Main {

    public static Object obj = new Object();

    public static void main(String[] args) {
	// write your code here
        Thread car1 = new Thread(new trafficLightControlledIntersection(1, 1, 2));
        Thread car2 = new Thread(new trafficLightControlledIntersection(3, 1, 1));
        Thread car3 = new Thread(new trafficLightControlledIntersection(5, 1, 2));
        Thread car4 = new Thread(new trafficLightControlledIntersection(2, 2, 4));
        Thread car5 = new Thread(new trafficLightControlledIntersection(4, 2, 3));

        car1.start();
        car2.start();
        car3.start();
        car4.start();
        car5.start();//Example 1
    }//end of main
}//end of Main
