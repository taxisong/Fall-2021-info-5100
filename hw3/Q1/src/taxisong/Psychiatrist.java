package taxisong;

public class Psychiatrist {
    //asks moody object about its mood
    public void examine(MoodyObject moodyObject){
        System.out.println("How are you feeling today?");
    }
    //a moodyObject is observed to either laugh or cry
    public void observe(MoodyObject moodyObject){
    }
    //returns message about self: “Subject laughs a lot”
    public String toString(){
        return "Subject laughs a lot";
    }
}
