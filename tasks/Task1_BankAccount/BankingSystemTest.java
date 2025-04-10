import bank.SavingsAccount;
import bank.CurrentAccount;
import user.UserAccount;
import java.util.Scanner;

public class BankingSystemTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get Savings Account Details
        System.out.println("Enter Savings Account Details (in Rupees):");
        System.out.print("Account Number: ");
        String savingsAccNum = scanner.nextLine();
        System.out.print("Account Holder Name: ");
        String savingsHolder = scanner.nextLine();
        System.out.print("Initial Balance: ");
        double savingsBalance = scanner.nextDouble();

        SavingsAccount savings = new SavingsAccount(savingsBalance);
        UserAccount savingsUser = new UserAccount(savingsAccNum, savingsHolder, savings);
        
        System.out.print("Enter deposit amount (₹): ");
        double depositAmount = scanner.nextDouble();
        savings.deposit(depositAmount);
        savingsUser.displayDetails();
        
        System.out.print("\nEnter withdrawal amount (₹): ");
        double withdrawAmount = scanner.nextDouble();
        boolean result = savings.withdraw(withdrawAmount);
        System.out.println("Withdrawal successful: " + result);
        savingsUser.checkBalance();

        scanner.nextLine(); // Clear buffer

        // Get Current Account Details
        System.out.println("\nEnter Current Account Details (in Rupees):");
        System.out.print("Account Number: ");
        String currentAccNum = scanner.nextLine();
        System.out.print("Account Holder Name: ");
        String currentHolder = scanner.nextLine();
        System.out.print("Initial Balance: ");
        double currentBalance = scanner.nextDouble();

        CurrentAccount current = new CurrentAccount(currentBalance);
        UserAccount currentUser = new UserAccount(currentAccNum, currentHolder, current);
        
        System.out.print("Enter deposit amount (₹): ");
        depositAmount = scanner.nextDouble();
        current.deposit(depositAmount);
        currentUser.displayDetails();
        
        System.out.print("\nEnter withdrawal amount (₹): ");
        withdrawAmount = scanner.nextDouble();
        result = current.withdraw(withdrawAmount);
        System.out.println("Withdrawal successful: " + result);
        currentUser.checkBalance();

        scanner.close();
    }
}
