package taxisong;
public enum Direction{
    UP,
    DOWN,
    LEFT,
    RIGHT
}
public class Roomba implements iRobot{

    int[][] room;
    Direction dir;
    int row;
    int col;

    public Roomba(int[][] room){
        this.room = room;
        dir = Direction.DOWN;
        this.row = 0;
        this.col = 0；
    }

    @Override
    public boolean move() {
        if (dir == Direction.UP){
            if(row -1 < 0 || room[row-1][col] == -1){
                return false;
            }
            row --;
        }
        if (dir == Direction.DOWN){
            if (row + 1 > room.length || room[row + 1][col] == -1){
                return false;
            }
            row++;
        }
        if (dir == Direction.LEFT){
            if (col - 1 < 0 || room[row][col - 1] == -1){
                return false;
            }
            col--;
        }
        if (dir == Direction.RIGHT){
            if (col + 1 > room[0].length || room[row][col + 1] == -1){
                return false;
            }
            col++;
        }

        return true;
    }

    @Override
    public void turnLeft() {
        if (dir == Direction.UP){
            dir = Direction.LEFT;
        }
        if (dir == Direction.LEFT){
            dir = Direction.DOWN;
        }
        if (dir == Direction.DOWN){
            dir = Direction.RIGHT;
        }
        if (dir == Direction.RIGHT){
            dir = Direction.UP;
        }
    }

    @Override
    public void turnRight() {
        if (dir == Direction.UP){
            dir = Direction.RIGHT;
        }
        if (dir == Direction.LEFT){
            dir = Direction.UP;
        }
        if (dir == Direction.DOWN){
            dir = Direction.LEFT;
        }
        if (dir == Direction.RIGHT){
            dir = Direction.DOWN;
        }
    }

    @Override
    public void clean() {
        this.room[row][col] = 1;
    }

    public int[][] getRoom() {
        return room;
    }

    public void setRoom(int[][] room) {
        this.room = room;
    }

    public Direction getDir() {
        return dir;
    }

    public void setDir(Direction dir) {
        this.dir = dir;
    }
}
