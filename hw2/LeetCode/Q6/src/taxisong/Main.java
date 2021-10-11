package taxisong;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s1 = "egg" , t1 = "add";//Example 1
        String s2 = "foo" , t2 = "bar";//Example 2
        String s3 = "abcdefg" , t3 = "hijklmn";//Example 3
        String s4 = "abc" , t4 = "ab";//Example 4

        Isomorphic(s1 , t1);
        Isomorphic(s2 , t2);
        Isomorphic(s3 , t3);
        Isomorphic(s4 , t4);
    }

    public static Boolean Isomorphic(String s , String t){
        if(s.length() != t.length()){
            System.out.println("false");
            return false;
        }else{
            int[]arr1 = new int[s.length()];
            int[]arr2 = new int[t.length()];

            int count1 = 1;
            int count2 = 1;

            for(int i = 1 ; i < s.length() ; i++) {
                int same = 0;
                for (int j = 0; j < i; j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        arr1[i] = arr1[j];
                        same++;
                    }
                }

                if(same == 0){
                    arr1[i] = count1;
                    count1++;
                }

            }

            for(int i = 1 ; i < t.length() ; i++){
                int same = 0;
                for(int j = 0 ; j < i ; j++) {
                    if (t.charAt(i) == t.charAt(j)) {
                        arr2[i] = arr2[j];
                        same++;
                    }
                }

                if(same == 0){
                    arr2[i] = count2;
                    count2++;
                }

            }

            //output

            int same = 0;
            for(int i = 0 ; i < s.length() ; i ++){
                if(arr1[i] != arr2[i]){
                    same = 1;
                }
            }

            if(same == 0){
                System.out.println("true");
                return true;
            }else{
                System.out.println("false");
                return false;
            }


        }//length else
    }//Isomorphic

}//Main
