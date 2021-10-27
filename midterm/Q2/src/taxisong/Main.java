package taxisong;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer pt = Printer.get_instance();
        System.out.println(pt.getConnection());
    }
}
