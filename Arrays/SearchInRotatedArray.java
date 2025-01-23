class SearchInRotatedArray{
    public static void main(String[] args){
        int nums[]  = {4,5,6,7,8,1,2,3};
        int target  = 1;

        int res = search(nums,target);
        System.out.print(res);
    }
    public static int search(int[] nums , int target){
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[start] <= nums[mid]) {
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }    
}
