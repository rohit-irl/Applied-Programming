class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int res[] = new int[n];
        int k = n - 1;
        while(left <= right){
            int left2 = nums[left] * nums[left];
            int right2 = nums[right] * nums[right];
            if(left2 > right2){
                res[k] = left2;
                left++;
                k--;
            }else{
                res[k] = right2;
                right--;
                k--;
            }
        }
        return res;
    }
}