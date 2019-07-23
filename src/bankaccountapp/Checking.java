package bankaccountapp;

public class Checking extends Account {

    int debitcardNumber;
    int debitcardPIN;
    
    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountnumber = "2" + accountnumber;
        setDebitCard();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }

    public void showInfo() {
        System.out.println("ACCOUNT TYPE : Checking");
        super.showInfo();
        System.out.println(
            "Your Checking Account Features: " +
            "\n Debit Card Number: " + debitcardNumber +
            "\n Debit Card PIN: " + debitcardPIN
        );
    }

    private void setDebitCard() {
        debitcardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitcardPIN = (int) (Math.random() * Math.pow(10, 4));
    }
}