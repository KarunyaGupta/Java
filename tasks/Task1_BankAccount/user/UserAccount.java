package user;

import bank.BankAccount;

public class UserAccount implements BankServices {
    private String accountNumber;
    private String accountHolderName;
    private BankAccount account;

    public UserAccount(String accountNumber, String accountHolderName, BankAccount account) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.account = account;
    }

    @Override
    public void checkBalance() {
        System.out.println("Current balance: ₹" + account.getBalance());
    }

    @Override
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: ₹" + account.getBalance());
    }
}
