import java.util.*;

class TernaryOperator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = in.nextInt();

        // Using the ternary operator to check eligibility
        String eligibility = (age > 18) ? "Eligible" : "Not Eligible";
        System.out.println(eligibility);
    }
}