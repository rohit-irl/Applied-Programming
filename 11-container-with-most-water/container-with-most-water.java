class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int start = 0;
        int end = n - 1;
        int max = 0;
        while(start < end){
            int width = end - start;
            int h = Math.min(height[start], height[end]);
            int area = h * width;
            max = Math.max(max, area);
            if(height[start] < height[end]){
                start++;
            }else{
                end--;
            }
        }
        return max;
    }
}