import java.util.*; 
class SelectionSort{
    public static void main(String[] args){
         // selection sort
        int[] arr = new int[10];
        inputArr(arr);
        printArray(arr); // before sorting
        for(int i=0;i<arr.length-1;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr); // after sorting
    }

    public static void inputArr(int[]arr){
        Scanner in = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
    }
    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
}