import java.util.*;
class SearchingIn2DArray{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int[][] arr = {
            {23,4,1},
            {18,1,2,5},
            {3,4,6,2,7,8}
        };

        System.out.println(search(arr,target));
    }

    static int search(int[][] arr, int target){
        int max = Integer.MIN_VALUE;
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    // System.out.print(row+" "+col);
                    return new int[] {row,col};
                }
            }
        }
        return max;
        
    }
}