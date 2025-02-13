import java.util.*;

class SudokuSolver{
    public static void main(String[] args){
        int sudoku[][] = {{0,0,8,0,0,0,0,0,0},
        {4,9,0,1,5,7,0,0,2},
        {0,0,3,0,0,4,1,9,0},
        {1,8,5,0,6,0,0,2,0},
        {0,0,0,0,2,0,0,6,2},
        {9,6,0,4,0,5,3,0,0},
        {0,3,0,0,7,2,0,0,4},
        {0,4,9,0,3,0,0,5,7},
        {8,2,7,0,0,9,0,1,3}
        };

        if(sudokuSolver(sudoku,0,0)){
            System.out.println("Solution Exist");
            printSudoku(sudoku);
        }else{
            System.out.println("Solution does'nt exist");
        }
    }

    public static boolean sudokuSolver(int[][] sudoku , int row , int col){

        if(row == 9 && col == 0){
            return true;
        }
        int nextrow = row;
        int nextCol = col +1;
        if(col == 8){
            nextrow = row +1 ;
            nextCol=0;
        }

        if(sudoku[row][col] != 0){
            return sudokuSolver(sudoku,nextrow,nextCol);
        }


        for(int digit =1; digit<=9;digit++){
            if(isSafe(sudoku,row,col,digit)){
                sudoku[row][col] = digit;
                if(sudokuSolver(sudoku,nextrow , nextCol)){
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
        
    }

    public static boolean isSafe(int[][] sudoku , int row , int col , int digit){
        // col 
        for(int i=0;i<8;i++){
            if(sudoku[i][col] == digit){ // row increase column remain same
                return false;
            }
        }

        for(int j=0;j<8;j++){
            if(sudoku[row][j] == digit){    // column increase and row remain same
                return false;
            }
        }

        // for 3*3 grid
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;
        for(int i=sr ;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudoku[i][j] == digit){
                    return false;
                }
            }
        }
        return true;

    }

    public static void printSudoku(int[][] sudoku){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }
}