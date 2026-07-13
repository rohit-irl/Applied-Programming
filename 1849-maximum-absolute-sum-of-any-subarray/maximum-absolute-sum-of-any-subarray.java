class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int maxsum = nums[0];
        int minsum = nums[0];
        int maxend = nums[0];
        int minend = nums[0];
        int res = Math.abs(nums[0]);

        for(int i = 1; i < n; i++){
            int v1 = nums[i];
            int v2 = maxend + nums[i];

            maxend = Math.max(v1 , v2);
            maxsum = Math.max(maxsum, maxend);

            int v3 = nums[i];
            int v4 = minend + nums[i];

            minend = Math.min(v3 , v4);
            minsum = Math.min(minsum, minend);

            res = Math.max(maxsum, Math.abs(minsum));
        }
        return res;
    }
}