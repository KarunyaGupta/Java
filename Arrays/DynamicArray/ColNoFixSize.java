import java.util.*;
class ColNoFixSize{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int[][] arr = {
            {1,2,3,4},
            {2,30},
            {2,4,6,7,8,90}
        };

        // input
        // for(int row = 0 ; row<arr.length;i++){
        //     for(int col = 0; col<arr[row].length;j++){
        //         arr[row][col] = in.nextInt();
        //     }
        // }

        // arr.length  --> number of rows
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        


    }
}