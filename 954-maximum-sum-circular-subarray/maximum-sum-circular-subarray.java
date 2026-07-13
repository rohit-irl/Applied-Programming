class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int res1 = nums[0];
        int res2 = nums[0];
        int res = nums[0];
        int maxpoint = nums[0];
        int minpoint = nums[0];
        int sum = nums[0];

        for(int i = 1; i < n; i++){
            int v1 = nums[i];
            int v2 = nums[i] + maxpoint;
            int v3 = nums[i] + minpoint;

            maxpoint = Math.max(v1, v2);
            res1 = Math.max(maxpoint, res1);

            minpoint = Math.min(v1, v3);
            res2 = Math.min(minpoint, res2);

            sum = sum + nums[i];
            res = Math.max(res1, sum - res2);   
        }
        if (res1 < 0) {
            return res1;
        }
        return res;
    }
}