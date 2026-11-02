class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        fun(root, res);
        return res;
    }
    void fun(TreeNode node, List<Integer> res){
        if(node == null){
            return;
        }
        res.add(node.val);
        fun(node.left, res);
        fun(node.right, res);
    }
}