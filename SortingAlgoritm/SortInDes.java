import java.util.*;
class SortInDes{
    public static void main(String[] args){
        int[] arr = new int[10];
        inputArr(arr);
        printArray(arr);
        sorted(arr);
        printArray(arr);
    }


    public static void sorted(int[] arr){
        // Bubble sort
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    public static void inputArr(int[] arr){
        Scanner in = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
    }
}