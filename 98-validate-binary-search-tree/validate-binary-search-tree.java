class Solution {
    boolean ans = true;
    TreeNode prev = null;
    public boolean isValidBST(TreeNode root) {
        fun(root);
        return ans;
    }
    void fun(TreeNode root){
        if(root == null){
            return;
        }
        fun(root.left);
        if(prev == null){
            prev = root;
        }else{
            if(root.val <= prev.val){
                ans = false;
            }
            prev = root;
        }
        fun(root.right);
    }
}