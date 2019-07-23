package bankaccountapp;

public class Saving extends Account {
    
    int safetyDepositBoxID;
    int safetyDepositBoxKey;
    
    public Saving(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountnumber = "1" + accountnumber;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("ACCOUNT TYPE : Saving");
    }
}