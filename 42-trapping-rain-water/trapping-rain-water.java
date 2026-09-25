class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int start = 0;
        int end = n - 1;
        int leftMax = 0;
        int rightMax = 0;
        int sum = 0;
        while(start < end){
            if(height[start] < height[end]){
                if(height[start] >= leftMax){
                    leftMax = height[start];
                }else{
                    sum = sum + leftMax - height[start];
                }
                start++;
            }else{
                if(height[end] >= rightMax){
                    rightMax= height[end];
                }else{
                    sum = sum + rightMax - height[end];
                }
                end--;
            }
        }
        return sum;
    }
}