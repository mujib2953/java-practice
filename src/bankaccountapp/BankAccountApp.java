package bankaccountapp;

public class BankAccountApp {
    public static void main(String... args) {

        Checking ch1 = new Checking("John Doe", "321456789", 1500);
        Saving sv1 = new Saving("Davy John", "987654123", 2500);
        
        ch1.showInfo();
        System.out.println("\n*****************");
        sv1.showInfo();

        sv1.deposit(5000);
        sv1.withdraw(200);
        sv1.transfer("Brokerage", 2000);

        sv1.compound();
    }
}