class Solution {
    public long countMajoritySubarrays(int[] nums, int target) {

        int n = nums.length;
        Fenwick tree = new Fenwick(2 * n + 5);
        long ans = 0;
        int offset = n + 2;
        int prefix = 0;
        tree.add(offset, 1);
        for (int num : nums) {
            if (num == target)
                prefix++;
            else
                prefix--;
            ans += tree.sum(prefix - 1 + offset);
            tree.add(prefix + offset, 1);
        }
        return ans;
    }
}

class Fenwick {
    int[] bit;
    Fenwick(int n) {
        bit = new int[n + 1];
    }
    void add(int i, int val) {
        while (i < bit.length) {
            bit[i] += val;
            i += i & -i;
        }
    }
    int sum(int i) {
        int ans = 0;
        while (i > 0) {
            ans += bit[i];
            i -= i & -i;
        }
        return ans;
    }
}