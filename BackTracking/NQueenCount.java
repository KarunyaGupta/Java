import java.util.*;

class NQueenCount {
    public static void main(String[] args) {
        int n = 1;
        char board[][] = new char[n][n];

        // Initialize the board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        int totalCount = nQueen(board, 0);
        System.out.print("Total solutions for " + n + "-Queens: " + totalCount);
    }

    public static int nQueen(char board[][], int row) {
        if (row == board.length) {
            return 1; // Found a valid solution
        }

        int count = 0; // Initialize count for this call

        // Column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q'; // Place queen
                count += nQueen(board, row + 1); // Recursive call and accumulate count
                board[row][j] = '.'; // Backtrack
            }
        }
        return count; // Return the count of solutions found
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