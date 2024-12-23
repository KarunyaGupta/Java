import java.util.*;
class Main{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,4,3,7,8,3,2,1};
        int res = countElements(arr);
        System.out.print(res);
    }
    public static int countElements(int[] nums) {
            Arrays.sort(nums);
            int count =1;
            for(int i=1;i<nums.length;i++){
                if(nums[i] == nums[i-1]){
                    count ++;
                }
            }
            return nums.length-count;
        }
    }
