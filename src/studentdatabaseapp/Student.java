package studentdatabaseapp;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String courses = "";
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

            if (course.equals("")) {
                continue;
            }

            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tutionBalance = tutionBalance + costOfCourse;
            } else {
                break;
            }
        } while( 1 != 0);
        System.out.println("\nENROLLED IN : " + courses);
    }

    public void viewBalance() {
        System.out.println("\nYour balance is : $" + tutionBalance);
    }

    public void payTution() {
        viewBalance();
        System.out.print("\nEnter your payment amount $");
        int amount = sc.nextInt(10);

        tutionBalance -= amount;

        System.out.println("\nThank you for paying $" + amount);
        viewBalance();
    }

    private void setStudentId() {
        
        id++;
        studentID = gradeYear + "" + id;
        
    }
}