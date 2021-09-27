package taxisong;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] nums = {1,1,1,1,1};

        int[]count = new int[5];
        int sum = 0;

        for(int i = 0; i < nums.length ; i++){
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count[i] = count[i] + 1;
                }
            }
            if(count[i] == 1){
                sum = sum + nums[i];
            }
        }

        System.out.println(sum);
    }
}
