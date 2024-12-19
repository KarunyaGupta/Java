import java.util.*;

class LargestElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the target value: ");
        int target = in.nextInt();
        
        int result = findLargestLessThanTarget(arr, target);
        
        if (result != Integer.MIN_VALUE) {
            System.out.println("The largest element less than " + target + " is: " + result);
        } else {
            System.out.println("No element is less than " + target);
        }
        
        in.close();
    }

    public static int findLargestLessThanTarget(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int largest = Integer.MIN_VALUE; 

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < target) {
                largest = arr[mid]; 
                start = mid + 1; 
            } else {
                end = mid - 1; 
            }
        }
        return largest; 
    }
}