package taxisong;

public class Printer {
    private Printer(){}

    private static Printer _instance;

    private static Object obj = new Object();

    public static Printer get_instance(){
        if(_instance == null){
            synchronized (obj){
                if(_instance == null){
                    _instance = new Printer();
                }
            }
        }
        return _instance;
    }

    public String getConnection(){
        return "Your Printer is working";
    }
}
