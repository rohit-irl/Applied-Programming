class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return check (root.left , root.right);
    }
    public boolean check(TreeNode x, TreeNode y){
        if (x == null && y == null)return true;
        if (x == null || y == null)return false;
        if (x.val != y.val)return false;
        return check(x.left, y.right) && check(x.right, y.left);
    }
}