package taxisong;

public class Main {



    public static void main(String[] args) {
	// write your code here
        int[][] room = {
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {-1, 0, 0, 0},
                {0, 0, -1, 0},
        };

        Roomba roomba = new Roomba(room);
    }
}
