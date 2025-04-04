import java.util.*;
class MergeSort{
    public static void main(String[] args){
        int[] arr = {2,1,1,4,5,6,6,631,2,1,45,5};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr , 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    public static void mergeSort(int[] arr , int start , int end){
        if(start>=end){
            return;
        }
        int mid = start + (end - start)/2;
        mergeSort(arr , start , mid);
        mergeSort(arr , mid+1 , end);
        merge(arr , start , mid , end);
    }
    public static void merge(int[] arr , int start, int mid , int end){
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=end){
            if(arr[i]<= arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while(j<=end){
            temp[k++] = arr[j++];
        }

        for(int f = 0 ; f< temp.length ; f++){
            arr[start + f] = temp[f];
        }
    }
}