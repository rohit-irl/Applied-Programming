class Solution {
    public int threeSumClosest(int[] nums, int target) {

        int n = nums.length;
        Arrays.sort(nums);

        int result = nums[0] + nums[1] + nums[2];

        for(int i = 0; i < n - 2; i++){
            int left = i + 1;
            int right = n - 1;

            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            left = i + 1;
            right = n - 1;

            while(left < right){
                int s = nums[i] + nums[left] + nums[right];

                if(Math.abs(target - s) < Math.abs(target - result)){
                    result = s;
                }

                if(s == target){
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left-1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right+1]){
                        right--;
                    }
                }
                else if (s < target){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return result;
    }
}

