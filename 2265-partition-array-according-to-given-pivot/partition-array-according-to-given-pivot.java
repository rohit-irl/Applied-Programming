class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        for (int num : nums) {
            if (num < pivot) {
                less.add(num);
            } else if (num == pivot) {
                equal.add(num);
            } else {
                greater.add(num);
            }
        }

        int[] ans = new int[nums.length];
        int id = 0;

        for (int a : less) ans[id++] = a;
        for (int a : equal) ans[id++] = a;
        for (int a : greater) ans[id++] = a;

        return ans;
    }
}