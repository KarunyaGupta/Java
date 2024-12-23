import java.util.*;
class FloorOfNumber{
    public static void main(String[] args){
        int[] arr = {2,3,5,9,14,16,18};
        int target = 19 ;
        int res = Floor(arr,target);
        System.out.print(res);
    }
    static int Floor(int[] arr , int target){
        int start = 0;
        int end = arr.length -1;
        // int index =0;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid +1;
            }else{
                return mid;
            }
        }
        return end;
    }
}