package taxisong;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class Student {
    private int id;
    private String name;
    private double gpa;
    private Date dateOfBirth;
    private String date;

    private SimpleDateFormat formatter = new SimpleDateFormat( "yyyyMMdd ");

    public Student(int id, String name, double gpa, String date){
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.date = date;
        try {
            this.dateOfBirth = formatter.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public SimpleDateFormat getFormatter() {
        return formatter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getGpa() {
        return gpa;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getDate() {
        return date;
    }
}//end of Student