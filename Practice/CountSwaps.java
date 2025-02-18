import java.util.*;


class SwapCount{
    public static void input(int[] arr){
        
        Scanner in = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
    }

    public static void printArray(int[] arr){
        System.out.print(Arrays.toString(arr));
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

class CountSwaps {
    public static int countSwap(int[] arr) {
        SwapCount sc = new SwapCount();
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // int temp = arr[j];
                    // arr[j] = arr[j + 1];
                    // arr[j + 1] = temp;
                    sc.swap(arr,j,j+1);
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        SwapCount sc = new SwapCount();
        int[] arr = new int[5];
        sc.input(arr);
       
        int ans = countSwap(arr);
        System.out.println(ans);
        // System.out.println(Arrays.toString(arr));
        sc.printArray(arr);
    }
}