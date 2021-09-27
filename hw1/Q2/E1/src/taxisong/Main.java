package taxisong;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[]nums = {-4,-1,0,3,10};
        int i;
        for( i = 0 ; i < nums.length ; i++){
            nums[i] = nums[i] * nums[i];
        }
        int a = 0;
        for(int j = 0 ; j < nums.length ; j++){
            for(i = 0 ; i < nums.length - 1 ; i++){
                if(nums[i] > nums[i + 1]){
                    a = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = a;
                }
            }
        }
        System.out.print("[");
        for(i = 0 ; i < nums.length -1 ; i ++){
            System.out.print(nums[i] + ",");
        }
        System.out.print(nums[nums.length - 1] + "]");
    }
}
