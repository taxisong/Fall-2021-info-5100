package taxisong;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][]matrix1 = {{1,2,3},{4,5,6},{7,8,9}};//Example 1
        int[][]matrix2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};//Example 2
        int[][]matrix3 = {{1,2},{3,4},{5,6},{7,8},{9,10}};//Example 3
        int[][]matrix4 = {{1,2,3,4,5}};//Example 4
        int[][]matrix5 = {{1},{2},{3},{4},{5}};//Example5

        int[]arr1 = Spiral(matrix1);
        int[]arr2 = Spiral(matrix2);
        int[]arr3 = Spiral(matrix3);
        int[]arr4 = Spiral(matrix4);
        int[]arr5 = Spiral(matrix5);
        output(arr1);
        output(arr2);
        output(arr3);
        output(arr4);
        output(arr5);

    }

    public static int[] Spiral(int[][]matrix) {
        int[] arr = new int[matrix.length * matrix[0].length];
        int count = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            arr[count] = matrix[0][j];
            count++;
        }//first line

        if (matrix.length != 1){
            if (matrix.length != 2){
                for (int i = 1; i < matrix.length - 1; i++){
                    arr[count] = matrix[i][matrix[0].length - 1];
                    count++;
                }//rightest column
            }//not 2 lines

            for (int i = 0; i < matrix.length / 2; i++){
                for (int j = matrix[0].length - 1 - i; j >= i; j--){
                    arr[count] = matrix[matrix.length - i - 1][j];
                    count++;
                }//bottom left

                if(i != matrix[0].length - i - 1){
                    if(matrix.length - i - 1 != i + 1){
                        if(matrix.length != i + 2){
                            for(int j = matrix.length - 2 - i ; j > i + 1 ; j--){
                                arr[count] = matrix[j][i];
                                count++;
                            }//left up
                        }//have left

                        for(int j = i ; j < matrix[0].length - i - 1 ; j++){
                            arr[count] = matrix[i + 1][j];
                            count++;
                        }//top right

                        if(matrix[0].length - i - 2 != i){
                            for(int j = i + 2 ; j < matrix.length - i - 2 ; j++){
                                arr[count] = matrix[j][matrix[0].length - i - 1];
                                count++;
                            }//right down
                        }

                    }//enough line
                }//not one column

            }


        }//not 1 line

        return arr;
    }

    public static void output(int[]nums){
        System.out.print("[" + nums[0]);
        for(int i =1 ; i < nums.length ; i++){
            System.out.print("," + nums[i]);
        }
        System.out.println("]");
    }

}
