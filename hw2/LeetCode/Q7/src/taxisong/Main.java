package taxisong;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String nums11 = "11" , nums21 = "123";//Example 1
        String nums12 = "456" , nums22 = "77";//Example 2
        String nums13 = "0" , nums23 = "0";//Example 3
        String nums14 = "1" , nums24 = "9";//Example4

        AddString(nums11,nums21);
        AddString(nums12,nums22);
        AddString(nums13,nums23);
        AddString(nums14,nums24);

    }

    public static String AddString(String nums1 , String nums2){

        int M = Math.max(nums1.length() , nums2.length());
        int[]arr1 = new int[M + 1];
        int[]arr2 = new int[M + 1];
        int[]arr = new int[M + 1];

        if(nums1.length() == M){
            arr1[0] = 0;
            for(int i = 0 ; i < M ; i++){
                arr1[i + 1] = nums1.charAt(i) - '0';
            }
            int difference = M - nums2.length();
            for(int j = 0 ; j < difference + 1 ; j++){
                arr2[j] = 0 ;
            }
            for(int j = 0 ; j < M - difference ; j++){
                arr2[M - j] = nums2.charAt(nums2.length() - j - 1) - '0';
            }

        } else{
            arr2[0] = 0;
            for(int i = 0 ; i < M ; i++){
                arr2[i + 1] = nums2.charAt(i) - '0';
            }
            int difference = M - nums1.length();
            for(int j = 0 ; j < difference + 1 ; j++){
                arr1[j] = 0;
            }
            for(int j = 0 ; j < M - difference ; j++){
                arr1[M - j] = nums1.charAt(nums1.length() - j - 1) - '0';
            }
        }

//        test arr1 , arr2
//        for(int i = 0 ; i < M + 1 ; i ++){
//            System.out.println(arr1[i]);
//        }
//        for(int i = 0 ; i < M + 1 ; i ++){
//            System.out.println(arr2[i]);
//        }


        for(int k = M ; k >= 0 ; k--){
            arr[k] = arr[k] + arr1[k] + arr2[k];
            if(arr[k] > 9){
                arr[k] = arr[k] - 10;
                arr[k - 1] = 1;
            }
        }

//        test arr
//        for(int i = 0 ; i < M + 1 ; i ++){
//            System.out.print(arr[i]);
//        }

        int digit = 0;
        if(arr[0] == 0){
            digit = M;
        }else{
            digit = M + 1;
        }

        String nums = new String();
        if(digit == M){
            int[]arr_ = new int[M];
            for(int i = 0 ; i < M ; i++){
                arr_[i] = arr[i + 1];
            }

            for(int j = 0 ; j < M ; j++){
                nums = nums + arr_[j];
            }
        }else{
            int[]arr_ = new int[M + 1];
            for(int i = 0 ; i < M + 1 ; i++){
                arr_[i] = arr[i];
            }

            for(int j = 0 ; j < M + 1 ; j++){
                nums = nums +  arr_[j];
            }
        }



        System.out.print("\"");
        for(int i = 0 ; i < nums.length() ; i ++){
            System.out.print(nums.charAt(i) - '0');
        }
        System.out.println("\"");

        return  nums;

    }//end of AddString

}
