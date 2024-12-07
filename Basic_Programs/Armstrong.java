import java.util.*;

class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        
        // Check if the entered number is an Armstrong number
        if (isArmstrong(n)) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
        // System.out.println(String.valueOf(n).length());
    }

    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        int numberOfDigits = String.valueOf(n).length(); // Get the number of digits

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum += Math.pow(rem, numberOfDigits); // Use the number of digits for power
        }

        return sum == original; 
    }
}