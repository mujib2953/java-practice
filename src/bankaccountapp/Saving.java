package bankaccountapp;

public class Saving extends Account {
    
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;
    
    public Saving(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountnumber = "1" + accountnumber;
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    public void showInfo() {
        System.out.println("\nACCOUNT TYPE : Saving");
        super.showInfo();
        System.out.println(
            "Your Saving Account Features: " +
            "\n Safety Deposit-box ID: " + safetyDepositBoxID +
            "\n Safety Deposit-box Key: " + safetyDepositBoxKey
        );
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }
}