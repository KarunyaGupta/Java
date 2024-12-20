import java.util.*;

class SearchInMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        
        System.out.println("Enter 9 integers for the 3x3 matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        
        System.out.print("Enter target: ");
        int target = in.nextInt();

        int[] res = search(matrix, target);
        if (res != null) {
            System.out.println("Target found at: " + Arrays.toString(res));
        } else {
            System.out.println("Target not found in the matrix.");
        }
    }

    static int[] search(int[][] matrix, int target) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}