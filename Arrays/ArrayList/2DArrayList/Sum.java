import java.util.ArrayList;

class Sum {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {1, 2, 4, 5},
            {1, 2, 4, 6}
        };
        
        ArrayList<Integer> rowSums = new ArrayList<>();
        sumRows(0, matrix, rowSums);
        
        System.out.println("Sum of each row: " + rowSums);
    }
    
    public static void sumRows(int i, int[][] matrix, ArrayList<Integer> rowSums) {
        if (i >= matrix.length) {
            return;
        }
        
        int sum = 0;
        for (int j = 0; j < matrix[i].length; j++) {
            sum += matrix[i][j];
        }
        
        rowSums.add(sum);
        sumRows(i + 1, matrix, rowSums);
    }
}