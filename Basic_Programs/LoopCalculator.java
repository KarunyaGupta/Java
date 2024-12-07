import java.util.*;

class LoopCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int ans = 0;
        while (true) {
            System.out.println("Enter operator: ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '/' || op == '*' || op == '%') {
                System.out.println("Enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;
                } else if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Error: Denominator cannot be 0 in this calculation");
                        continue; // Skip printing ans if there's an error
                    }
                } else if (op == '%') {
                    ans = num1 % num2;
                }
                
                System.out.println("Result: " + ans);
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid operation");
            }


        }
        
       // in.close(); // Close the scanner
    }
}