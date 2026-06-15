class Solution {
    public void sortColors(int[] nums) {
        int a[] = new int[nums.length];
        int b[] = new int[nums.length];
        int c[] = new int[nums.length];
        int n = nums.length;

        int ai = 0, bi = 0, ci = 0;

        for(int i = 0; i < n; i++){
            
            if(nums [i] == 0){
                a[ai++] = nums[i];
            }
            else if(nums [i] == 1){
                b[bi++] = nums[i];
            }else{
                c[ci++] = nums[i];
            }
        }
        int index = 0;

        for(int i = 0; i < ai; i++){
            nums[index++] = a[i];
        }
        for(int i = 0; i < bi; i++){
            nums[index++] = b[i];
        }
        for(int i = 0; i < ci; i++){
            nums[index++] = c[i];
        }
        
    }
}