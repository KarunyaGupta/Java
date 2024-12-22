import java.util.*;

class BubbleSortInMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Define the size of the matrix
        System.out.print("Enter the number of rows: ");
        int rows = in.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = in.nextInt();
        
        // Initialize the matrix
        int[][] matrix = new int[rows][cols];
        
        // Input the matrix
        inputMatrix(matrix);
        
        // Print the original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);
        
        // Sort each row of the matrix using bubble sort
        for (int i = 0; i < matrix.length; i++) {
            bubbleSort(matrix[i]);
        }
        
        // Print the sorted matrix
        System.out.println("Sorted Matrix:");
        printMatrix(matrix);
        
        in.close();
    }

    public static void inputMatrix(int[][] matrix) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

    public static void bubbleSort(int[] row) {
        int n = row.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (row[j] > row[j + 1]) {
                    int temp = row[j];
                    row[j] = row[j + 1];
                    row[j + 1] = temp;
                }
            }
        }
    }
}