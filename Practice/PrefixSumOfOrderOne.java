import java.util.*;

class PrefixSumOfOrderOne {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 1, 6, 4};
        Scanner in = new Scanner(System.in);
        
        // Create the prefix sum array
        int[] res = createPrefixSumArray(arr);
        System.out.println(Arrays.toString(res));
        
        // Get the range from the user
        System.out.print("start index: ");
        int start = in.nextInt();
        System.out.print("end index: ");
        int end = in.nextInt();
        int sum = calculateRangeSum(res, start, end);
        System.out.println(sum);
    }
    
    public static int[] createPrefixSumArray(int[] arr) {
        int[] prefixSum = new int[arr.length];
        prefixSum[0] = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }
    
    public static int calculateRangeSum(int[] prefixSum, int start, int end) {
        if (start == 0) {
            return prefixSum[end];
        } else {
            return prefixSum[end] - prefixSum[start - 1];
        }
    }
}