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

    public static int Compression(char[] chars) {
        int len=0;
        for(int i=0;i<chars.length;){
            int cnt=1;
            while(i+1<chars.length && chars[i]==chars[i+1]){
                i++;
                cnt++;
            }
            chars[len++]=chars[i++];
            if(cnt>1){
                String cntStr = String.valueOf(cnt);
                char[] cnt_arr= cntStr.toCharArray();
                for(int j=0; j < cnt_arr.length; j++){
                    chars[len++] = cnt_arr[j];
                }

            }

        }

        System.out.print("[\"" + chars[0] + "\"");
        for (int i = 1 ; i < len ; i++) {
            System.out.print(",\"" + chars[i] + "\"");
        }
        System.out.println("]");

        return len;



    }
}
