package taxisong;

public class Main {

    private static int[][] matrix;

    public static void main(String[] args) {
//	 write your code here
        int[][]arr1 = {{1,2,3},{4,5,6},{7,8,9}};//Example 1
        int[][]arr2 = {{1,2,3},{4,5,6}};//Example 2


        int[][]arr1_ = transpose(arr1);
        int[][]arr2_ = transpose(arr2);
        output(arr1_);
        output(arr2_);

    }

    public static int[][] transpose(int[][]matrix){
        int[][]matrix_ = new int[matrix[0].length][matrix.length];
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[i].length ; j++){
                matrix_[j][i] = matrix[i][j];
            }
        }
        return matrix_;
    }

    public static void output(int[][]matrix){
        System.out.print("[[" + matrix[0][0]);
        for(int k = 1 ; k < matrix[0].length ; k++){
            System.out.print("," + matrix[0][k]);
        }
        System.out.print("]");
        for(int i = 1 ; i < matrix.length ; i++){
            System.out.print(",[" + matrix[i][0]);
            for(int j = 1 ; j < matrix[i].length ; j++){
                System.out.print("," + matrix[i][j]);
            }
            System.out.print("]");
        }
        System.out.println("]");
    }

}
