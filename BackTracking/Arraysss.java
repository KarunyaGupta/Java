import java.util.*;
class Arraysss{
    public static void main(String[] args){
        int[] arr = new int[5];
        
        recursion(0,arr);
        System.out.print(Arrays.toString(arr));
        

    }


    // using recursion
    public static void recursion(int i , int[] arr){
        if(i==arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }
        arr[i] = i+1;
        recursion(i+1,arr);
        arr[i] = arr[i] -2; // hear is the concept of backtracking
    }

    
}