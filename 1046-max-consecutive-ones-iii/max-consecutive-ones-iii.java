class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int low = 0;
        int res = 0;
        int zero = 0;

        for(int high = 0; high < n; high++){
            if(nums[high] == 0){
                zero++;
            }
            while(zero > k){
                if(nums[low] == 0){
                    zero--;
                }
                low++;
            }
            int len = high - low + 1;
            res = Math.max(res, len);
        }
        return res;
    }
}