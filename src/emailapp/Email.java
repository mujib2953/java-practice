package emailapp;

import java.util.Scanner;

public class Email {
    private String firtsName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private String alternateEmail;
    private final String companySuffix = "xyzcompany.com";

    private int mailboxCapacity;
    private int defaultPasswordlength = 10;

    public Email(String firstName, String lastName) {
        this.firtsName = firstName;
        this.lastName = lastName;

        System.out.println("EMAIL CREATED :: " + this.firtsName + " " + this.lastName + "\n");

        this.department = setDepartment();
        System.out.println("Selected Department :: " + this.department);

        this.password = randomPassword(defaultPasswordlength);
        System.out.println("\nPassword :: " + this.password);

        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
        System.out.println("\nEmail :: " + email);
    }

    private String setDepartment() {
        System.out.println("DEPARTMENT CODES: \n1. Sales \n2. Development \n3. Accounts \n0. None \nEnter the department: ");

        Scanner sc = new Scanner(System.in);
        int departmentChoice = sc.nextInt();
        sc.close();

        if (departmentChoice == 1) { return "sales"; }
        else if (departmentChoice == 2) { return "dev"; }
        else if (departmentChoice == 3) { return "accounting"; }
        else { return ""; }
    }

    private String randomPassword(int passwordLength) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[passwordLength];

        for (int i = 0; i < passwordLength; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    // --- We will ask for department

    // --- generate radnom password

    // --- set mailbox capacity

    // --- set alternate email / change the password
}
