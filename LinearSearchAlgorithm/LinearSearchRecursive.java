import java.util.*;
class LinearSearchRecursive{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,32,1,3};
        int num = 32;
        int ans = search(num , arr,0);
        System.out.print(ans);

        if(ans == -1){
            System.out.println("Target no found!");
        }
    }

    public static int search(int num , int[] arr , int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == num){
            return i;
        }
        return search(num,arr,i+1);

    }
}