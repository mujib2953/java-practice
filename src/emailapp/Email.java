package emailapp;

import java.util.Scanner;

public class Email {
    private String firtsName;
    private String lastName;
    private String password;
    private String department;
    private String alternateString;

    private int mailboxCapacity;

    public Email(String firstName, String lastName) {
        this.firtsName = firstName;
        this.lastName = lastName;

        System.out.println("EMAIL CREATED :: " + this.firtsName + " " + this.lastName);

        this.department = setDepartment();
        System.out.println("Selected Department : " + this.department);
    }

    private String setDepartment() {
        System.out.println("DEPARTMENT CODES: \n1. Sales \n2.Development \n3. Accounts \n0. None \nEnter the department: ");

        Scanner sc = new Scanner(System.in);
        int departmentChoice = sc.nextInt();
        sc.close();

        if (departmentChoice == 1) { return "sales"; }
        else if (departmentChoice == 2) { return "dev"; }
        else if (departmentChoice == 3) { return "accounting"; }
        else { return ""; }
    }

    // --- We will ask for department

    // --- generate radnom password

    // --- set mailbox capacity

    // --- set alternate email / change the password
}
