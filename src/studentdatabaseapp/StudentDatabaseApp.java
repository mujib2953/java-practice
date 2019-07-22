package studentdatabaseapp;

public class StudentDatabaseApp {
    public static void main(String... args) {

        Student st1 = new Student();
        st1.enroll();
        st1.payTution();

        System.out.println(st1.toString());
    }
}