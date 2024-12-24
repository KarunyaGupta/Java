import java.util.*;
class CountingSort{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,1};
        countingSort(arr);
        System.out.print(Arrays.toString(arr));
       
        
    }
    public static void countingSort(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }

        int[] count = new int[largest+1]; 
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }        
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        

    }
}