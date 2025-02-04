// 9 5 2 6 4 3 8 1
import java.util.*;
class Main{
    public static void main(String[] args){
        int[] arr = {9,5,2,6,4,3,8,1};
        int target = 4;
        boolean ans = search(arr,target);
        System.out.println(ans);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    public static boolean search(int[] arr , int target){
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return true;
            }
            if(arr[mid]<target){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return false;
    }

}
