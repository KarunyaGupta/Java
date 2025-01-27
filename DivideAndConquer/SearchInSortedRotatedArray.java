import java.util.*;
class SearchInSortedRotatedArray{
    public static void main(String[] args){
        int arr[]={4,5,6,7,0,1,2};
        int target = 0;
        int ans = search(arr,target,0,arr.length-1);
        System.out.print(ans);
    }

    public static int search(int arr[] , int target , int start , int end){
        int mid = start + (end-start)/2;
        if(arr[mid]==target){
            return mid;
        }

        if(arr[start]<=arr[mid]){
            if(arr[start]<= target && target <= arr[mid]){
                return search(arr,target,start,mid-1);
            }else{
                return search(arr,target,mid+1,end);
            }
        }else{
            if(arr[mid]<= target && target<=arr[end]){
                return search(arr,target,mid+1,end);
            }else{
                return search(arr,target,start,mid-1);
            }
        }
    }
}