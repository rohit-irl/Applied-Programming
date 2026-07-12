class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int res = nums[0];
        int maxbestend = nums[0]; 
        int minbestend = nums[0];

        for(int i = 1; i < n; i++){ 
            
            int v1 = nums[i];
            int v2 = nums[i] * maxbestend;
            int v3 = nums[i] * minbestend;

            maxbestend = Math.max(v1, Math.max(v2, v3));
            minbestend = Math.min(v1, Math.min(v2, v3));

            res = Math.max(res, Math.max(maxbestend, minbestend));
        }
        return res;
    }
}