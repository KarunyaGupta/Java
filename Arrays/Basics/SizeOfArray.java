import java.util.*;
class SizeOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4};
        int len = arr.length; 
        int sizeInBytes = len * Integer.BYTES; 
        System.out.print(sizeInBytes); 


        // int arr[]={10,20,30,40,50,60};
        // // idx = 9;/'''
        // arr[9] = 40;
        // System.out.print(Arrays.toString(arr)); // out of bound

    }
}