package taxisong;

public abstract class MoodyObject {
    private String Mood;

    // Return the mood : sad or happy – depending on which object sends the message
    public abstract String getMood();
    // Each Object expresses a different motion
    public abstract void ExpressFeelings();
//an object responds according to how it feels, print ”I feel Happy(or Sad) today!!”
    public void queryMood(){
        System.out.println("I feel " + this.getMood() + " today!!");
    }

}
