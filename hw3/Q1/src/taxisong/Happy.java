package taxisong;

public class Happy extends MoodyObject{
    @Override
    public String getMood() {
        return "happy";
    }

    @Override
    public void ExpressFeelings() {
        System.out.println("heeehee….hahahah…HAHAHA!!");
    }

    //returns message about self: “Subject laughs a lot”
    @Override
    public String toString(){
        return "Observation:Subject laughs a lot";
    }
}
