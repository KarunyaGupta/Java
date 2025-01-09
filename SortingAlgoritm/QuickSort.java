import java.util.*;
class QuickSort{
    public static void main(String[] args){
        // same time complexity in avg case O(nlogn);
        // wrost case O(n^2);
        // space complexity O(1) -> linear
        
        // approach
        //Pivot & Partition 
        // 1. TO choose a pivit --> center point with which all the elements revolve
        // a. random element 
        // b. last element
        // c. first element

        // 2. Partition 
        //3. quicksort (left) / quicksort(right)

        int[] arr = {6,3,9,8,2,5};
        quicksort(arr,0,arr.length-1);
        printArray(arr);
    }
    public static void quicksort(int[] arr , int start , int end){
        // last element
        if(start>=end){
            return;
        }
        int pidx = partition(arr,start,end);
        quicksort(arr,start,pidx-1);
        quicksort(arr,pidx+1,end);

    }
    public static int partition(int[] arr , int start , int end){
        int pivot = arr[end];
        int i = start-1; // to make place for element
        for(int j=start;j<end;j++){
            if(arr[j]<=pivot){
                i++;
                //swap 
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[end] = arr[i];
        arr[i] = temp;
       return i ; 

    }
    public static void printArray(int[] arr){
        System.out.print(Arrays.toString(arr));
    }
}