package taxisong;

public class trafficLightControlledIntersection implements Runnable{
    public trafficLightControlledIntersection(){}

    public static boolean lightA = true;

    public static void carArrived(
            int carId,           // ID of the car
            int roadId,          // ID of the road the car travels on. Can be 1 (road A) or 2 (road B)
            int direction,       // Direction of the car
            Runnable turnGreen,  // Use turnGreen.run() to turn light to green on current road
            Runnable crossCar    // Use crossCar.run() to make car cross the intersection
    ){
        synchronized (Main.obj){
            if (roadId == 1){
                if (!lightA){
                    turnGreen.run();
                    lightA = true;
                }
                crossCar.run();
            } else {
                if (lightA){
                    turnGreen.run();
                    lightA = false;
                }
                crossCar.run();
            }//end of if else}

//            @Override
//            public void run() {
//                synchronized (Main.obj){
//                    if (roadId == "A"){
//                        System.out.println("Car " + Thread.currentThread().getName() + " Has Passed Rode A In Direction " + Thread.currentThread().getName());
//                        if (!lightA){
//                            turnGreen.run();
//                            lightA = true;
//                        }
//                        crossCar.run();
//                    } else {
//                        System.out.println("Car " + Thread.currentThread().getName() + " Has Passed Rode B In Direction " + Thread.currentThread().getName());
//                        if (lightA){
//                            turnGreen.run();
//                            lightA = false;
//                        }
//                        crossCar.run();
//                    }//end of if else
//                }
//            }//end of run
        }
    }
