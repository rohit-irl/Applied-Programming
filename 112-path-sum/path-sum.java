class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return fun(root, targetSum, 0);
    }
    boolean fun(TreeNode root, int targetSum, int sum){
        if(root == null){
            return false;
        }
        sum = sum + root.val;
        if(root.left == null && root.right == null){
            return sum == targetSum;
        }
        return fun(root.left, targetSum, sum) ||
        fun(root.right, targetSum, sum);
    }
}