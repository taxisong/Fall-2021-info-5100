package taxisong;

public class Main {

    public static void main(String[] args) {
	// write your code here
        char[]chars1 = {'a','a','b','b','c','c','c'};//Example 1
        char[]chars2 = {'a'};//Example 2
        char[]chars3 = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};//Example 3
        char[]chars4 = {'a','a','a','b','b','a','a'};//Example 4

        Compression(chars1);
        Compression(chars2);
        Compression(chars3);
        Compression(chars4);
    }

    public static char[] Compression(char[]chars) {
        String s = new String();
        int ergodic = 0;

        if (chars.length == 1) {
            s = s + chars[0];
        }

        for (int i = 0; ergodic < chars.length - 1; i++) {
            int count = 1;
            for (int j = ergodic; j < chars.length - 1; j++) {
                if (chars[j] == chars[j + 1]) {
                    count++;
                    ergodic++;
                } else {
                    ergodic++;
                    break;
                }
            }
            if (count == 1) {
                s = s + chars[ergodic - 1];
            } else {
                s = s + chars[ergodic - 1] + count;
            }
        }

//        test s
//        System.out.println(s);

        System.out.print("[\"" + s.charAt(0) + "\"");
        for (int i = 1; i < s.length(); i++) {
            System.out.print(",\"" + s.charAt(i) + "\"");
        }
        System.out.println("]");

        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }

        return chars;

    }
}
