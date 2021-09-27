package taxisong;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[]arr = {6,7,5,5,4,3,7,7,8,1,6,0,2,9,9,8,4,3,2,2,7};

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
