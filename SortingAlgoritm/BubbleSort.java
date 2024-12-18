import java.util.*;
class BubbleSort{
    public static void main(String[] args){
        int[] arr = new int[10];

        inputArr(arr);
        printArray(arr);

        // bubble sort 
        // time complexity = O(n^2);
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //swap 
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= temp ;
                }
            }
        }
        printArray(arr);
    }
    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    public static void inputArr(int[]arr){
        Scanner in = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
    }
}