package taxisong;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums1 = {1, 1, 1};//Example 1
        int[] nums2 = {1, 2, 3};//Example 2

        System.out.println(totalnumber(nums1, 2));
        System.out.println(totalnumber(nums2, 3));
    }//end of main

    public static int totalnumber(int[] nums, int k){
        int count = 0;

        for (int left = 0; left < nums.length; left++){
            int sum = 0;
            for (int right = left; right >=0; right--){
                sum += nums[right];
                if (sum == k){
                    count++;
                }
            }
        }
        return count;
    }//end of totalnumber
}//end of Main
