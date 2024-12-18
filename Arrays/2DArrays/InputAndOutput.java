import java.util.*;
class InputAndOutput{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        System.out.println(arr.length); // number of rows


        // input of array
        for(int row = 0;row<arr.length;row++){
            for(int col = 0;col<arr[row].length;col++){
                arr[row][col] = in.nextInt();
            }
        }



        // print an array
        for(int row = 0;row<arr.length;row++){
            for(int col = 0;col<arr[row].length;col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

       for(int i=0;i<arr.length;i++){
        System.out.println(Arrays.toString(arr[i]));
       }

        
    }
}