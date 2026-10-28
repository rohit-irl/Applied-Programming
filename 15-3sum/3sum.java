class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int left = i + 1;
            int right = n - 1;
            if(i > 0 && nums[i] == nums[i - 1]){
                    continue;
            }
            while(left < right){
                if(nums[i] + nums[left] + nums[right] == 0){
                    res.add (Arrays.asList(nums[i], nums[left], nums[right]));
                    while(left < right && nums[left] == nums[left + 1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right - 1]){
                        right--;
                    }
                    left++;
                    right--;
                }
                else if(nums[i] + nums[left] + nums[right] > 0){
                    right--;
                }else{
                    left++;
                }
            }
        }
        return res;
    }
}