package taxisong;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s1 = "A man , a plan , a canal: Panama";//Example 1
        String s2 = "race a car";//Example 2
        String s3 = "0";//Example 3

        Palindrome(s1);
        Palindrome(s2);
        Palindrome(s3);
    }

    public static boolean Palindrome(String s){
        StringBuilder variant = new StringBuilder();

        s = s.trim();

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                variant.append(Character.toLowerCase(ch));
            }
        }

//        test variant
//        System.out.println(variant);

        int count = 0;
        for(int i = 0 ; i < variant.length() / 2 ; i ++){
            if(variant.charAt(i) != variant.charAt(variant.length() - 1 - i)){
                count++;
                System.out.println("false");
                return false;
            }
        }
        if(count == 0){
            System.out.println("true");
            return true;
        }

        return true;
    }


}
