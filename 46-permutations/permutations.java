import java.util.*;
class Solution {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(nums, 0, res);
        return res;
    }

    void backtrack(int[] nums, int i, List<List<Integer>> res) {
        if (i == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (int x : nums) temp.add(x);
            res.add(temp);
            return;
        }

        for (int j = i; j < nums.length; j++) {
            int t = nums[i]; nums[i] = nums[j]; nums[j] = t;
            backtrack(nums, i + 1, res);
            t = nums[i]; nums[i] = nums[j]; nums[j] = t;
        }
    }
}