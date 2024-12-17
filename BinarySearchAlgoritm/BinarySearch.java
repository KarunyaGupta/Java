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

        System.out.print("Enter target element : ");
        int target = in.nextInt();

        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));

        // System.out.print(Arrays.toString(arr));
        int ans = binarySearch(arr,target);
        System.out.print(ans);
    }

    // return the index
    static int binarySearch(int[] arr , int target){
        int start = 0;
        int end = arr.length-1;
        while(start<= end){
            int mid = start + (end-start)/2; // might be possible that this exeed the range of integer 
            if(target<arr[mid]){
                end = mid-1;
            }else if(target>arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }   
        }
        return -1;
    }
}