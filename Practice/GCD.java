import java.util.*;

class GCD{
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        System.out.print(findGCD(nums));
    }

    public static int findGCD(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        // to find the smallest number in array 
        for(int i=0;i<nums.length;i++){
            if(nums[i]<Integer.MAX_VALUE){
                smallest = nums[i];
            }
        }

        // to find the largest number
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>Integer.MIN_VALUE){
                largest = nums[i];
            }
        }

        // GCD 
        int x = smallest;
        int y = largest;
        while(x%y!=0){
            int rem = x%y;
            x=y;
            y= rem;
        }
        return y;
    }
}