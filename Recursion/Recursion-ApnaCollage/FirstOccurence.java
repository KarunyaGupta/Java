import java.util.*;
class FirstOccurence{
    public static void main(String[] args){
        int[] arr = {2,3,4,1,2};
        int target = 2;
        int res = firstOccurence(arr,0,target);
        System.out.print(res);



        // to find all 
        ArrayList<Integer> indices = new ArrayList<>();
        
        findOccurrences(arr,0,target,indices);

        System.out.print(indices);
    }

    public static int firstOccurence(int[] arr,int i , int target){
        if(i==arr.length){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }
        return firstOccurence(arr,i+1,target);
    }

   public static void findOccurrences(int[] arr, int i, int target, ArrayList<Integer> indices) {
        // Base case: if we reach the end of the array, return
        if (i == arr.length) {
            return;
        }
        // Check if the current element is the target
        if (arr[i] == target) {
            indices.add(i); // Store the index in the ArrayList
        }
        // Recursive call to check the next index
        findOccurrences(arr, i + 1, target, indices);
    }
}