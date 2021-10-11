package taxisong;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[]nums1 = {0,1,0,3,12};//Example 1
        int[]nums2 = {7,0,7,2,1,0,0,5,6};//Example 2
        int[]nums3 = {5,0,0,0,0,0,5};//Example 3
        int[]nums4 = {0};//Example 4
        int[]nums5 = {1,2,3,4,5,6,7};//Example 5

        nums1 = MoveZero(nums1);
        nums2 = MoveZero(nums2);
        nums3 = MoveZero(nums3);
        nums4 = MoveZero(nums4);
        nums5 = MoveZero(nums5);
        output(nums1);
        output(nums2);
        output(nums3);
        output(nums4);
        output(nums5);

    }

    public static int[] MoveZero(int[]nums){
        int j = 0;  //start
        for (int i = 0 ; i < nums.length ; i++){  //end
            if(nums[i] == 0){
                j = i;
                for(i = i + 1 ; i < nums.length ; i++){
                    if (nums[i] != 0){
                        nums[j] = nums[i];
                        nums[i] = 0;
                        break;
                    }
                }
                i = j;
            }
        }
        return nums;
    }

    public static void output(int[]nums){
        System.out.print("[" + nums[0]);
        for(int i =1 ; i < nums.length ; i++){
            System.out.print("," + nums[i]);
        }
        System.out.println("]");
    }

}
