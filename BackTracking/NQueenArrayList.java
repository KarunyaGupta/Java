import java.util.*;

class NQueen {
    public static void main(String[] args) {
        int n = 4;
        char board[][] = new char[n][n];
        ArrayList<ArrayList<String>> res = new ArrayList<>();
        
        // Initialize the board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        
        nQueen(board, 0, res);
         
        // Print all solutions in the desired format
        System.out.println(res);
    }

    public static ArrayList<ArrayList<String>> nQueen(char board[][], int row, ArrayList<ArrayList<String>> result) {
        if (row == board.length) {
            ArrayList<String> str = new ArrayList<>();
            for (char[] in : board) {
                str.add(new String(in));
            }
            result.add(str);
            return result;
        }

        // Column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueen(board, row + 1, result); // Function call 
                // Backtrack
                board[row][j] = '.'; // Backtracking step
            }
        }
        return result; // Return the result
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        // Vertically up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Left diagonal up 
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Right diagonal up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
}   