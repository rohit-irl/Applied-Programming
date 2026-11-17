class Solution {
    TreeNode prev = null;
    TreeNode g1first = null;
    TreeNode g1second = null;
    TreeNode g2first = null;
    TreeNode g2second = null;
    int galat = 0;
    public void recoverTree(TreeNode root) {
        fun(root);
        if(galat == 1){
            swap(g1first, g1second);
        }else{
            swap(g1first, g2second);
        }
    }
    void fun(TreeNode root){
        if(root == null){
            return; 
        }
        fun(root.left);
        if(prev == null){
            prev = root;
        }else{
            if(root.val < prev.val){
                if(galat == 0){
                    g1first = prev;
                    g1second = root;
                }else{
                    g2first = prev;
                    g2second = root;
                }
                galat++;
            }
            prev = root;
        }
        fun(root.right);
    }
    void swap(TreeNode a, TreeNode b){
        int temp = a.val;
        a.val = b.val;
        b.val = temp;
    }
}