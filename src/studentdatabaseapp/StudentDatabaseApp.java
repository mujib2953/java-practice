package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String... args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students to enroll : ");
        int numberOfStudent = sc.nextInt();

        Student[] students = new Student[numberOfStudent];

        for (int i = 0; i < numberOfStudent; i++) {
            students[i] = new Student();
            students[i].enroll();
            students[i].payTution();
        }

        for (int i = 0; i < numberOfStudent; i++) {
            System.out.println(students[i].toString());
        }
    }
}