class Sum {
    public static void main(String[] args) {
        int sum = 0;
        
        int[][] matrix = {
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4}
        };

        // Calculate the total sum of all elements
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }

        System.out.println("Total sum: " + sum);

        // Calculate the sum of each row
        int[] rowSums = sumRow(matrix);
        System.out.print("Row sums: ");
        for (int rowSum : rowSums) {
            System.out.print(rowSum + " ");
        }
    }

    static int[] sumRow(int[][] matrix) {
        int[] rowSums = new int[matrix.length]; // Array to hold the sum of each row

        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j]; 
            }
            rowSums[i] = sum;
        }
        return rowSums;
    }
}