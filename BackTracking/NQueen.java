import java.util.*;
// import java.util.Scanner;
class NQueen{
    public static void main(String[] args){
        int n = 4;
        char board[][] = new char[n][n];

        // initialize 
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';
            }
        }
        nQueen(board,0);
    }

    public static void nQueen(char board[][], int row){

        if(row == board.length){
            printBoard(board);
            return;
        }
        // column loop 

        for(int j=0;j<board.length;j++){
            if(isSafe(board  , row , j)){
                board[row][j] = 'Q';
                nQueen(board , row + 1); // function call 
                // backtrack
                board[row][j] = '.'; // backtracking step
            }
        }
    }


    public static boolean isSafe(char[][] board , int row , int col) {
        // vertically up
        // for(int i = row -1 ; i>=0;i--){
        //     if(board[i][col] == 'Q'){
        //         return false;
        //     }
        // }

        // // for(int i=0;i<row;i++){
        // //     if(board[i][col] == 'Q'){
        // //         return false;
        // //     }
        // // }

        // // left diagonal up 
        // for(int i= row-1,j=col-1;i>=0 && j>=0; i--,j--){
        //     if(board[i][j]=='Q'){
        //         return false;
        //     }
        // }

        // // right diagonal up
        // for(int i = row -1 , j= col+1;i>=0&&j<board.length;i--,j++){
        //     if(board[i][j] == 'Q'){
        //         return false;
        //     }
        // }
        // return true;


        for(int i= row -1 ; i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
            
        }

        for(int i = row -1 , j = col-1 ; i>=0 && j>=0 ; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        for(int i= row -1 , j= col+1 ;i>=0 && j<board.length;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;


    }


    public static void printBoard(char board[][]){
        System.out.println("------Chess Board-----");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}