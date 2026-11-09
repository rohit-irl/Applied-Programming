class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ans[] = new TreeNode[1];
        fun(root, p, q, ans);
        return ans[0];
    }
    int fun(TreeNode node, TreeNode p, TreeNode q, TreeNode ans[]){
        if(node == null){
            return 0;
        }
        int left = fun(node.left, p, q, ans);
        int right = fun(node.right, p, q, ans);
        int self = 0;
        if(node == p || node == q){
            self = 1;
        }
        int total = self + right + left;
        if(total == 2 && ans[0] == null){
            ans[0] = node;
        }
        return total;
    }
}