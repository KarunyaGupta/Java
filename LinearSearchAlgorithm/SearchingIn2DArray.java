import java.util.*;

class SearchingIn2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] matrix = {
            {1, 2, 3, 4, 6},
            {3, 4, 6, 7},
            {6, 8, 0, 4, 66, 64}
        };

        

        System.out.print("Enter the target value to search: ");
        int target = in.nextInt();
        boolean found = false; // Flag to check if the target is found

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) { // Corrected loop variable
                if (matrix[i][j] == target) {
                    System.out.println("Target found at row = " + i + ", column = " + j);
                    found = true; // Set the flag to true if found
                }
            }
        }

        if (!found) { // Check if the target was not found after all iterations
            System.out.println("No target found");
        }


        //function calling
        int[] ans =search(matrix, target);
        System.out.print(Arrays.toString(ans));

    }

    // using function
    static int[] search(int[][] arr , int target){
            for(int row = 0;row<arr.length;row++){
                for(int col = 0;col<arr[row].length;col++){
                    if(arr[row][col]==target){
                        return new int[]{row , col};
                    }
                }
            }
            return new int[]{-1, -1};
        }
}