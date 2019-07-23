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
    }

    public void showInfo() {
        
        System.out.println(
            "Name : " + name + 
            "\nSSN : " + sSN + 
            "\nBALANCE : $" + balance +
            "\nACCOUNT # :" + accountnumber
        );
    }

    private String setAccountNumber() {
        String last2OfSSN = sSN.substring(sSN.length() - 2, sSN.length());
        int uniqueId = index;
        int random3Digit = (int) (Math.random() * Math.pow(10, 3));

        return last2OfSSN + uniqueId + random3Digit;
    }
}