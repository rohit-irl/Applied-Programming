class Solution {
    public boolean isCompleteTree(TreeNode root) {
        if(root == null){
            return true;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean nullfound = false;
        while(!q.isEmpty()){
            TreeNode t = q.poll();
            if(t == null){
                nullfound = true;
            }else{
                if(nullfound){
                    return false;
                }
                q.offer(t.left);
                q.offer(t.right);
            }
        }
        return true;
    }
}