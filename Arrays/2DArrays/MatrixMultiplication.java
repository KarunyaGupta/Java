public class MatrixMultiplication {
    public static void main(String[] args) {
        // Define two matrices
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] B = {
            {7, 8},
            {9, 10},
            {11, 12}
        };

        // Call the method to multiply the matrices
        int[][] result = multiplyMatrices(A, B);

        // Print the result
        if (result != null) {
            for (int[] row : result) {
                for (int value : row) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
        }
    }

    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        
        int m = A.length;        
        int n = A[0].length;     
        int p = B[0].length;     

        
        if (B.length != n) {
            System.out.println("Matrix multiplication is not possible.");
            return null;
        }

        int[][] C = new int[m][p];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return C;
    }
}