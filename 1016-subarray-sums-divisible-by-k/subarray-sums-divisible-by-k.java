class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i = 0; i < n; i++){
            sum = sum + nums[i];
            int rem = sum % k;
            // for negative remainders
            if(rem < 0){
                rem = rem + k;
            }
            count = count + map.getOrDefault(rem, 0);
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        return count;
    }
}