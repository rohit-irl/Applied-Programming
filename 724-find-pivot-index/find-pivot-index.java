class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int left = 0;
        int sum = 0;
        int right = 0;

        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        if (sum - nums[0] == 0) {
            return 0;
        }
        for(int i = 1; i < n; i++){
            left += nums[i - 1];
            right = sum - nums[i] - left;
            if(left == right){
                return i;
            }
        }
        return -1;
    }
}