package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

import utilities.CSV;

public class BankAccountApp {
    public static void main(String... args) {

        List<Account> accounts = new LinkedList<Account>();

        final String filePath = "C:\\CSV\\NewBankAccounts.csv";
        List<String[]> newAccountHolder = CSV.read(filePath);

        for (String[] accountHolder : newAccountHolder) {
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);

            if (accountType.equals("Savings")) {
                accounts.add(new Saving(name, sSN, initDeposit));
            } else if (accountType.equals("Checking")) {
                accounts.add(new Checking(name, sSN, initDeposit));
            } else {
                System.out.println("Error reading Acount Type.");
            }
        }

        for (Account acc: accounts) {
            acc.showInfo();
        }
    }
}