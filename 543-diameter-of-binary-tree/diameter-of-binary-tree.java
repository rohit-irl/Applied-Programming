class Solution {
    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        fun(root);
        return res;
    }
    int fun(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = fun(root.left);
        int right = fun(root.right);
        int sum = left + right;
        res = Math.max(sum, res);
        return 1 + Math.max(left, right);
    }
}