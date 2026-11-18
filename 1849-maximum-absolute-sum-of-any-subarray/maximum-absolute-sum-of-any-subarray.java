class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        int min = nums[0];
        int bestmax = nums[0];
        int bestmin = nums[0];
        int res = Math.abs(nums[0]);
        for(int i = 1; i < n; i++){
            int v1 = nums[i];
            int v2 = nums[i] + max;
            max = Math.max(v1, v2);
            bestmax = Math.max(max, bestmax);

            int v3 = nums[i];
            int v4 = nums[i] + min;
            min = Math.min(v3, v4);
            bestmin = Math.min(min, bestmin);

            res = Math.max(bestmax, Math.abs(bestmin));
        }
        return res;
    }
}