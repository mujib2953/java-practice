package bankaccountapp;

public class Checking extends Account {

    int debitcardNumber;
    int debitcardPIN;
    
    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountnumber = "2" + accountnumber;
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("ACCOUNT TYPE : Checking");
    }
}