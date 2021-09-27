package taxisong;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[]arr = {2,3,4,2,2,3,5,7};

        int[]count = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++){
            for(int j = 0 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    count[i] += 1;
                }
            }
        }

        int a = 0;
        for(int k = arr.length - 1 ; k >= 0 ; k--){
            if(count[k] == 1){
                a = k;
            }
        }

        System.out.println(arr[a]);
    }
}
