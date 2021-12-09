package taxisong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name：");
        String name = scanner.nextLine();
        System.out.println("Please enter your date of birth(yyyyMMdd)：");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Received");

        SimpleDateFormat formatter = new SimpleDateFormat( "yyyyMMdd ");
        try {
            Date date = formatter.parse(dateOfBirth);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
