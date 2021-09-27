package taxisong;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String ransomNote = "aa";
        String magazine = "ab";

        boolean bValue = magazine.contains(ransomNote);
        if(bValue){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
