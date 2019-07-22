package bankaccountapp;

public class Saving extends Account {
    
    int safetyDepositBoxID;
    int safetyDepositBoxKey;
    
    public Saving(String name) {
        super(name);
        System.out.println("NEW SAVING ACCOUNT.");
    }
}