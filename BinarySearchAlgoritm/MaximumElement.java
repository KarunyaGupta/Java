public class MaximumElement {
    
    public static int findMaxInRotatedArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than the rightmost element,
            // then the maximum is in the right half (including mid)
            if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else { // The maximum is in the left half (including mid)
                right = mid;
            }
        }

        // When left == right, we have found the maximum element
        return arr[left - 1]; // Since left points to the smallest element
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int maxElement = findMaxInRotatedArray(arr);
        System.out.println("The maximum element in the rotated array is: " + maxElement);
    }
}