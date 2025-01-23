import java.util.*;
class PowerSet{
    public static void main(String[] args){
        int[] nums = {1,2};
    //  [],[1],[2],[3],[1,2],[1,3],[2,3],[1,2,3];  

    // create a 2D list     
        List<List<Integer>> list = subsets(nums);
        System.out.print(list);

    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < (1<<n); i++) {    //Math.pow(2,n) ==> (1<<n)
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    subset.add(nums[j]);
                }
            }
            result.add(subset);
        }
        return result;
    }
}
