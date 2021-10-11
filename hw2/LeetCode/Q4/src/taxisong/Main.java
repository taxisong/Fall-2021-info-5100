package taxisong;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[][]matrix1 = {{1,2,3},{4,5,6},{7,8,9}};//Example 1
        int[][]matrix2 = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};//Example 2
        int[][]matrix3 = {{1}};//Example 3
        int[][]matrix4 = {{1,2},{3,4}};//Example 4

        matrix1 = Rotate(matrix1);
        matrix2 = Rotate(matrix2);
        matrix3 = Rotate(matrix3);
        matrix4 = Rotate(matrix4);
        output(matrix1);
        output(matrix2);
        output(matrix3);
        output(matrix4);

    }

    public static int[][] Rotate(int[][]matrix){

        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = i + 1 ; j < matrix[i].length ; j++){
                int hold1 = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = hold1;
            }
        }

        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix[i].length / 2 ; j ++){
                int hold2 = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[i].length - j -1];
                matrix[i][matrix[i].length - j -1] = hold2;
            }
        }

        return matrix;
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
