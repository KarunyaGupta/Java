public class BinarySearch {

    // Recursive method for binary search
    public static int binarySearch(int[] arr, int left, int right, int target) {
        // Base case: if the left index exceeds the right index, the target is not found
        if (left > right) {
            return -1; // Target not found
        }

        // Calculate the middle index
        int mid = left + (right - left) / 2;

        // Check if the target is present at mid
        if (arr[mid] == target) {
            return mid; // Target found
        }

        // If the target is smaller than mid, search in the left half
        if (arr[mid] > target) {
            return binarySearch(arr, left, mid - 1, target);
        }

        // If the target is larger than mid, search in the right half
        return binarySearch(arr, mid + 1, right, target);
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int target = 10;

        int result = binarySearch(arr, 0, arr.length - 1, target);
        if (result == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}