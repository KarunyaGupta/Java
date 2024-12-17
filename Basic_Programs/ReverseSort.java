import java.util.Arrays;
import java.util.Collections;

class ReverseSort {
    public static void main(String[] args) {
        Integer[] arr = {3, 4, 7, 9, 2, 1}; // Use Integer instead of int
        
        // Sort the array in reverse order
        Arrays.sort(arr, Collections.reverseOrder());
        
        // Print the reversed sorted array
        System.out.print(Arrays.toString(arr));
    }
}