class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int res = nums[0];
        int bestend = nums[0];
        for(int i = 1; i < n; i++){
            int v1 = bestend + nums[i];
            int v2 = nums[i];
            bestend = Math.max(v1, v2);
            res = Math.max(res, bestend);
        }
        return res;
    }
}