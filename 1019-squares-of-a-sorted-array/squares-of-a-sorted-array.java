class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int k = n - 1;
        int[] res = new int[n];

        while(left <= right){
            int sqleft = nums[left] * nums[left];
            int sqright = nums[right] * nums[right];
            if(sqleft > sqright){
                res[k] = sqleft;
                k--;
                left++;
            }else{
                res[k] = sqright;
                k--;
                right--;
            }
        }
        return res;
    }
}