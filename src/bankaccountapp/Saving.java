package bankaccountapp;

public class Saving extends Account {
    
    int safetyDepositBoxID;
    int safetyDepositBoxKey;
    
    public Saving(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        System.out.println("NEW SAVING ACCOUNT.");
    }
}