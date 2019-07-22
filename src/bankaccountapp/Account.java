package bankaccountapp;

public abstract class Account implements IBaseRate {

    String name;
    String sSN;
    String accountnumber;

    double balance;
    double rate;

    public Account(String name) {
        System.out.println("NAME : " + name);
        System.out.print("NEW ACCOUNT : ");
    }
}