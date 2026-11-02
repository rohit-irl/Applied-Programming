class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        fun(root, res);
        return res;
    }
    void fun(TreeNode node, List<Integer> res){
        if(node == null){
            return;
        }
        fun(node.left, res);
        fun(node.right, res);
        res.add(node.val);
    }
}