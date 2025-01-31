import java.util.*;
class FindAllIndex{
    public static void main(String[] args){
        int[] arr = {1,1,2,3,4,6,1,3,1,1};
        idx(arr,1,0);
    }
    public static int idx(int[] arr , int target ,int start){
        if(start == arr.length){
            return -1;
        }
        if(arr[start]==target){
            System.out.print(start + " ");
        }
        return idx(arr,target,start+1);
    }
}