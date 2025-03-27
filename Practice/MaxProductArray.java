import java.util.*;
class MaxProductArray{
    public static void main(String[] args){
        int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);
        System.out.print("Max Product Array: ");
        System.out.println(arr[arr.length-1]*arr[arr.length-2]);
    }
}