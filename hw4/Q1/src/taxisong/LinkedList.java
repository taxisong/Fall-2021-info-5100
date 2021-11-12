package taxisong;

public class LinkedList implements Runnable{
    int val;
    LinkedList next;
    LinkedList(){}
    LinkedList(int val) { this.val = val; }
    LinkedList(int val, LinkedList next) { this.val = val; this.next = next; }

    public static Object obj = new Object();

    @Override
    public void run() {
        synchronized (obj){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void addAtPosition(int index, int element){ }
    public void removeAtPosition(int index, int element){ }
    public int getFirst(LinkedList list) {return list.val;}
    public int getLast(LinkedList list) {
        while(list.next != null){
            list = list.next;
        }
        return list.val;
    }
    public int size(LinkedList list){
        int count = 1;
        while(list.next != null){
            list = list.next;
            count++;
        }
        return count;
    }
}//end of LinkedList
