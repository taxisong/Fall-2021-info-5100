package taxisong;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Fiction fiction = new Fiction("Harry Poter", 150.5, "2003");

        System.out.println(fiction.description());

        fiction.setBorrowDate(3);
        fiction.setReturnDate(7);

        System.out.println(fiction.isAvailable(5));
        System.out.println(fiction.isAvailable(10));
    }
}
