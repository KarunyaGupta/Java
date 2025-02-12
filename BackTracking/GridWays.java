import java.util.*;
class GridWays{
    public static void main(String[] args){
        // allows moves right and down 
        // not a left and top
        int row = 51;
        int col = 9;
        int ways =  gridWays(0,0,row,col);

        System.out.println(ways);
    }

    public static int gridWays(int i , int j , int n , int m){
        if(i==n-1 && j== m-1){

            return 1;
        }
        if(i==n || j==m){
            return 0;
        }
        
        int w1 = gridWays(i+1,j,n,m);
        int w2 = gridWays(i,j+1,n,m);
        return w1+w2;
    }
}