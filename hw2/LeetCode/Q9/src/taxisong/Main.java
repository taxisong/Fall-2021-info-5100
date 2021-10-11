package taxisong;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s1 = "the sky is blue";//Example 1
        String s2 = "  Hello World  ";//Example 2
        String s3 = "a good      example";//Example 3
        String s4 = "   Bob  loves      Alice";//Example 4
        String s5 = "Alice does not even like Bob";//Example 5
        String s6 = "a";

        ReverseWord(s1);
        ReverseWord(s2);
        ReverseWord(s3);
        ReverseWord(s4);
        ReverseWord(s5);
        ReverseWord(s6);

    }

    public static String[] ReverseWord(String s){
        s = s.trim();

        String[] sp = s.split("\\s+");
        String[] S = new String[sp.length];

//        test S
//        for(int i = 0 ; i < sp.length ; i++){
//            System.out.println(sp[i]);
//        }

        for(int i = 0 ; i < sp.length ; i ++){
            S[i] = sp[sp.length - i - 1];
        }

        System.out.print("\"" + S[0]);
        for(int i = 1 ; i < S.length ; i++){
            System.out.print( " " + S[i]);
        }
        System.out.println("\"");

        return S;

    }

}
