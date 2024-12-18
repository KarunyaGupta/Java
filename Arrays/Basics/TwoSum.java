import java.util.*;
class TwoSum{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] nums  = new int[10];
        for(int i=0;i<nums.length;i++){
            nums[i] = in.nextInt();
        }
        int target = in.nextInt();

        int[] res =twoSum(nums, target);
        System.out.print(Arrays.toString(res));

    }
    public static int[] twoSum(int[] nums, int target){
        int[] index = new int[2];
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+ nums[j]== target){
                    index[0] = i;
                    index[1] = j;
                    // break;
                }
            }
        }
        return index;
    }
}