class Solution {
    public void sortColors(int[] nums) {
        int a = 0, b = 0, c = 0;
        for(int num : nums){
            if(num == 0) a++;
            else if(num == 1) b++;
            else c++;
        }
        int i = 0;
        while(a-- > 0) nums[i++] = 0;
        while(b-- > 0) nums[i++] = 1;
        while(c-- > 0) nums[i++] = 2;
    }
}