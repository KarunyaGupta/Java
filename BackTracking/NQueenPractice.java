import java.util.*;

class NQueenPractice{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[][] grid = new char[n][n];
        // initiisation of gird
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                grid[i][j] = '.';
            }
        }

        nQueen(grid , 0);



        // for count
        char[][] grid2 = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                grid2[i][j] = '.';
            }
        }
        int cnt = nQueenCount(grid2,0);
        System.out.println("The number of gird possible is : " + cnt);

    }

    public static void nQueen(char[][] grid , int row){
        if(grid.length==row){
            printGrid(grid);
            return;
        }

        for(int j= 0;j<grid.length;j++){
            if(safe(grid , row , j)){
                grid[row][j] = 'Q';
                nQueen(grid , row+1);
                grid[row][j] = '.';
            }
        }
    }

    public static boolean safe(char[][] grid , int row , int col){
        for(int i= row-1;i>=0;i--){
            if(grid[i][col] == 'Q'){
                return false;
            }
        }
        for(int i= row -1 , j= col-1;i>=0 && j>=0 ; i--,j--){
            if(grid[i][j] == 'Q'){
                return false;
            }
        }

        for(int i = row-1, j= col+1; i>=0 && j<grid.length;i--,j++){
            if(grid[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }


    public static void printGrid(char[][] grid){
        System.out.println("-----Grid-----");
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }


    // now for count the number of board formation 

    // safe method remain same
    public static int nQueenCount(char[][] grid, int row){
        int count = 0;
        if(grid.length == row){
            return 1;
        }
        for(int j= 0;j<grid.length;j++){
            if(safe(grid , row , j)){
                grid[row][j] = 'Q';
                count += nQueenCount(grid , row+1);
                grid[row][j] = '.';
            }
        }
        return count;
    }


    // arrayList Store
}