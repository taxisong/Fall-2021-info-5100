package taxisong;

import sun.security.provider.Sun;

import java.util.Arrays;

public class Main {

//    For the given array,
//    return the sum of all the numbers which are repeated.
//
//            Ex: Input : array = {1,3,-1,3,4,-1}
//
//    Output : 3 + (-1) = 2

    public static void main(String[] args) {
	// write your code here
        int[]array1 = {1,3,-1,3,4,-1};//Example 1

        System.out.println(SumOfAllRepeatedNumber(array1));
    }//end of main
    public static int SumOfAllRepeatedNumber(int[] array){
        int ans = 0;
        Arrays.sort(array);
        int i = 0;
        while(i < array.length - 1){
            if(array[i] == array[i + 1]){
                ans += array[i];
                for(int j = i; j < array.length; j++){
                    if(array[j] != array[j + 1]){
                        i = j + 1;
                        j = array.length;
                    }
                }
            }else{
                i++;
            }
        }
        return ans;
    }
}//end of Main
