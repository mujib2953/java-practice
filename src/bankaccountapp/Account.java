package bankaccountapp;

public abstract class Account implements IBaseRate {

    String name;
    String sSN;
    String accountnumber;

    double balance;
    double rate;

    private static int index = 10000;

    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;

        index++;

        accountnumber = setAccountNumber();
        setRate();
    }

    public void showInfo() {
        
        System.out.println(
            "Name : " + name + 
            "\nSSN : " + sSN + 
            "\nBALANCE : $" + balance +
            "\nRATE : " + rate + "%" +
            "\nACCOUNT # :" + accountnumber
        );
    }

    public abstract void setRate();

    private String setAccountNumber() {
        String last2OfSSN = sSN.substring(sSN.length() - 2, sSN.length());
        int uniqueId = index;
        int random3Digit = (int) (Math.random() * Math.pow(10, 3));

        return last2OfSSN + uniqueId + random3Digit;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("\nDepositing $" + amount);
        printBalance();
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("\nWithdrawing $" + amount);
        printBalance();
    }

    public void transfer(String toWhere, double amount) {
        System.out.println("\nTransferring $" + amount + " to " + toWhere);
        balance -= amount;
        printBalance();
    }

    public void printBalance() {
        System.out.println("Your balance is now: $" + balance);
    }
}