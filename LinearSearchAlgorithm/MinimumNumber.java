import java.util.*;
class MinimumNumber{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,-1, 7, -3};
        int res = min(arr);
        System.out.println(res);
        System.out.println(min2(arr));
    }

    static int min(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    static int min2(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    
}