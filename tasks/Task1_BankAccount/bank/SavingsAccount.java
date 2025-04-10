package bank;

public class SavingsAccount extends BankAccount {
    private static final double MINIMUM_BALANCE = 5000;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= MINIMUM_BALANCE) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
