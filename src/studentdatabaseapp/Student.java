package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String courses;
    private String studentID;
    
    private int gradeYear;
    private int tutionBalance = 0;

    private static int costOfCourse = 600;
    private static int id = 1000;

    private static Scanner sc = new Scanner(System.in);

    public Student() {

        System.out.print("\nEnter Studen first Name: ");
        firstName = sc.nextLine();

        System.out.print("\nEnter Studen last Name: ");
        lastName = sc.nextLine();

        System.out.print("\n1 - Freshmen \n2 - Sophmore \n3 - Junior \n4 - Senior");
        System.out.print("\nEnter student class level : ");
        gradeYear = sc.nextInt();
        
        setStudentId();

        System.out.println("\n" + firstName + ", " + lastName + " from " + gradeYear + " SID : " + studentID);
    }

    public void enroll() {

        do {
            System.out.print("Enter course to enrol (Q to quit): ");

            String course = sc.nextLine();

            if (!course.equals("Q") && sc.hasNext()) {
                courses = courses + "\n" + course;
                tutionBalance = tutionBalance + costOfCourse;
            } else {
                break;
            }
        } while( 1 != 0);
        System.out.println("ENROLLED IN : " + courses);
        System.out.println("TUTION BALANCE : " + tutionBalance);
    }

    private void setStudentId() {
        
        id++;
        studentID = gradeYear + "" + id;
        
    }
}