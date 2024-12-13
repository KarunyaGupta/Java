import java.util.Scanner;

public class InvertedRAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of rows for the inverted right-angle triangle: ");
        int rows = scanner.nextInt();
        
        for (int i = rows; i >= 1; i--) { // Start from the number of rows and go down to 1
            for (int j = 1; j <= i; j++) { // Print stars for the current row
                System.out.print("* "); // Print star followed by a space
            }
            System.out.println(); // Move to the next line after each row
        }
        
        scanner.close();
    }
}