import java.util.*;

class PrintSubArray {
    public static void printSubArray(int[] arr) {
        int totalPairs = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int sum = 0;

                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                }

                if (sum > maxSum) {
                    maxSum = sum;
                }

                totalPairs++;
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Total Pairs: " + totalPairs);
        System.out.println("Max Sum: " + maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        printSubArray(arr);
    }
}