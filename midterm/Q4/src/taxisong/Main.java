package taxisong;

public class Main {

//    Given a string s,
//    find the longest substring without repeating characters.
//
//    Ex: Input: s = "abcabcbb"
//
//    Output: abc
//
//    Explanation: The answer is "abc", with the length of 3.

    public static void main(String[] args) {
	// write your code here
        String s1 = "abcabcbb";

        System.out.println(LongestSubstring(s1));
    }//end of main
    public static String LongestSubstring(String s){
        int M = 0;
        int start = 0, end = 0;
        String sub = new String();
        String ans = new String();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(sub.indexOf(c) == -1){
               sub = sub + c;
               M = Math.max(M,sub.length());
               if(M == sub.length()){
                   ans = sub;
               }
           }else{
                sub = sub.substring(sub.indexOf(c) + 1) + c;
            }
        }
        return ans;
    }//end of LongestSubstring
}//end of Main
