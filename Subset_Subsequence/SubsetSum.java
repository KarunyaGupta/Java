import java.util.*;

class SubsetSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int target = 3;
        System.out.print(subSum(arr, target));
    }

    public static int subSum(int[] arr, int target) {
        int n = arr.length;
        int count = 0;

        // Generate all subsets using bit manipulation
        for (int i = 0; i < (1 << n); i++) {
            int sum = 0; // Reset sum for each subset
            for (int j = 0; j < n; j++) {
                // Check if jth element is included in the subset
                if ((i & (1 << j)) !=0) {
                    sum += arr[j];
                }
            }
            // Check if the sum of the current subset equals the target
            if (sum == target) {
                count++;
            }
        }
        return count;
    }
}