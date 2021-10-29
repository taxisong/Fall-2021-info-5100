package taxisong;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Psychiatrist psy = new Psychiatrist();
        Happy mood1 = new Happy();
        Sad mood2 = new Sad();

        psy.examine(mood1);
        mood1.queryMood();
        mood1.ExpressFeelings();
        System.out.println(mood1.toString());

        psy.examine(mood2);
        mood2.queryMood();
        mood2.ExpressFeelings();
        mood2.toString();
        System.out.println(mood2.toString());
    }
}
