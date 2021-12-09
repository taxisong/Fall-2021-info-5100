package taxisong;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DrivingLicenseApplication {
    public static void application(Date date){
        Calendar now = Calendar.getInstance();
        now.setTime(new Date());
        Calendar birth = Calendar.getInstance();
        birth.setTime(date);
        int age = now.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
        if (now.get(Calendar.DAY_OF_YEAR) > birth.get(Calendar.DAY_OF_YEAR)){
            age += 1;
        }
        if (age < 16){
            System.out.println("The age of the applicant is " + age + " which is too early to apply for a driving license");
        }
    }
}//end of DrivingLicenseApplication
