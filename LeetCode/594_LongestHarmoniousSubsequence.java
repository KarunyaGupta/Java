class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);  // Sort for two-pointer sliding window
        int j = 0, ans = 0;

        for (int i = 0; i < nums.length; i++) {
            while (nums[i] - nums[j] > 1)
                j++;

            if (nums[i] - nums[j] == 1)
                ans = Math.max(ans, i - j + 1);
        }

        return ans;
    }
}