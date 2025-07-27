import java.util.*;

public class BinarySearch{
    public static int binarySearch(int[] arr, int num){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = ( start + end - start) /2;
            if(arr[mid] == num){
                return mid;
            }
            if(arr[mid]<num){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
        System.out.println(binarySearch(arr,5));
    }
}