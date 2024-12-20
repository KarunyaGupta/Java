import java.util.Scanner;

public class JaggedArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Step 2: Create the jagged array
        int[][] jaggedArray = new int[rows][];

        // Step 3: Read the elements for each row
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter the number of elements in row " + (i + 1) + ": ");
            int cols = scanner.nextInt();
            jaggedArray[i] = new int[cols]; // Initialize the sub-array

            System.out.println("Enter " + cols + " elements for row " + (i + 1) + ":");
            for (int j = 0; j < cols; j++) {
                jaggedArray[i][j] = scanner.nextInt(); // Fill the sub-array
            }
        }

        // Step 4: Print the jagged array
        System.out.println("The jagged array is:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println(); // New line for each row
        }
    }
}