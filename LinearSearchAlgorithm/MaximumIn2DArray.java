import java.util.*;

class MaximumIn2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] matrix = {
            {1, 2, 3, 4, 6},
            {3, 4, 6, 7},
            {6, 8, 0, 4, 66, 64}
        };

        

      int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) { 
                if (matrix[i][j]> max) {
                    max = matrix[i][j];
                }
            }
        }
        
        System.out.print(max);

    }
    
}