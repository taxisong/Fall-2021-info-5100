package taxisong;

import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Main{

    public static void main(String[] args) {
	// write your code here
        Student student1 = new Student(1, "Bill", 3.5, "20020101");
        Student student2 = new Student(2, "Tom", 3.2, "19960517");
        Student student3 = new Student(3, "Mark", 3.6, "19891230");
        Student student4 = new Student(4, "Peter", 3.3, "19990215");
        Student student5 = new Student(5, "John", 3.9, "20051127");
        Student student6 = new Student(6, "Jill", 4.0, "19930811");
        Student student7 = new Student(7, "Sara", 3.7, "19961213");
        Student student8 = new Student(8, "Beth", 3.4, "20000507");

        List<Student> students = new LinkedList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        students.add(student7);
        students.add(student8);

        ArrayList<Student> students_ = new ArrayList<>();
        students_.add(student1);
        students_.add(student2);
        students_.add(student3);
        students_.add(student4);
        students_.add(student5);
        students_.add(student6);
        students_.add(student7);
        students_.add(student8);

        ArrayList<Student> students__ = new ArrayList<>();
        students_.add(student1);
        students_.add(student2);
        students_.add(student3);
        students_.add(student4);
        students_.add(student5);
        students_.add(student6);
        students_.add(student7);
        students_.add(student8);

        students_.sort(new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                return st1.getName().compareTo(st2.getName());
            }
        });

        System.out.println("NameComparator:");
        for (Student student : students_){
            System.out.println(student.getName());
        }

        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                return st2.getGpa().compareTo(st1.getGpa());
            }
        });

        System.out.println("GpaComparator:");
        for (Student student : students){
            System.out.println(student.getName() + " gpa : " + student.getGpa());
        }

        students__.sort(new Comparator<Student>() {
            @Override
            public int compare(Student st1, Student st2) {
                return st1.getDate().compareTo(st2.getDate());
            }
        });

        System.out.println(" DateOfBirthComparator:");
        for (Student student : students_){
            System.out.println(student.getName() + " date of birth : " + student.getDate());
        }
    }//end of main
}
