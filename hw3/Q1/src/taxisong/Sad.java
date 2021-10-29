package taxisong;

public class Sad extends MoodyObject{
    @Override
    public String getMood() {
        return "sad";
    }

    @Override
    public void ExpressFeelings() {
        System.out.println("‘waah’ ‘boo hoo’ ‘weep’ ‘sob ‘");
    }

    //returns message about self : “Subject cries a lot”
    @Override
    public String toString(){
        return "Observation:Subject cries a lot";
    }
}
