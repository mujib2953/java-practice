package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String courses;
    private String studentID;
    
    private int gradeYear;
    private int tutionBalance;

    private static int costOfCourse = 600;
    private static int id = 1000;

    public Student() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Studen first Name: ");
        firstName = sc.nextLine();

        System.out.print("\nEnter Studen last Name: ");
        lastName = sc.nextLine();

        System.out.print("\n1 - Freshmen. \n2 - Sophmore \n3 - Junior \n4 - Senior");
        System.out.print("\nEnter student class level : ");
        gradeYear = sc.nextInt();
        sc.close();

        setStudentId();

        System.out.println("\n" + firstName + ", " + lastName + " from " + gradeYear + "SID : " + studentID);
    }

    private void setStudentId() {
        
        id++;
        studentID = gradeYear + "" + id;
        
    }
}