import java.util.*;
class BinarySearch{
    public static void main(String[] args){
        // find the middel element
        // check if the target element> middle than check right
        // if middle element == target --> print that one
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }

        Arrays.sort(arr);

        System.out.print(Arrays.toString(arr));
        

        
    }
}