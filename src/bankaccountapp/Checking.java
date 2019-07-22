package bankaccountapp;

public class Checking extends Account {

    int debitcardNumber;
    int debitcardPIN;
    
    public Checking(String name) {
        super(name);
        System.out.println("NEW CHECKING ACCOUNT.");
    }
}