package bankaccountapp;

public abstract class Account implements IBaseRate {

    String name;
    String sSN;
    String accountnumber;

    double balance;
    double rate;

    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        balance = initDeposit;

        System.out.println("\nName : " + name +" SSN : " + sSN + " BALANCE : $" + balance);
    }
}