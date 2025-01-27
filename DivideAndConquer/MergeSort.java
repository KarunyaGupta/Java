import java.util.*;

class MergeSort {
    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }

    public static void mergeSort(int[] arr, int start, int end) {
        // Base case: if the start index is greater than or equal to the end index
       if(start>=end){
        return;
       }
       int mid = start + (end-start)/2;
       mergeSort(arr,start,mid);
       mergeSort(arr,mid+1,end);
       merge(arr,start,mid,end);
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start; // Iterator for left part
        int j = mid + 1; // Iterator for right part
        int k = 0; // Iterator for temporary array

        // Merge the two halves into temp
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of left part, if any
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements of right part, if any
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        // Copy temp back to original array
        for (k = 0; k < temp.length; k++) {
            arr[start + k] = temp[k]; 
        }
    }

    public static void printArray(int[] arr) {
        System.out.print(Arrays.toString(arr));
    }
}