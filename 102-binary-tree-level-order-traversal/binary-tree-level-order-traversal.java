class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int lvlsize = q.size();
            List<Integer> temp = new ArrayList<>();
            while(lvlsize-- > 0){
                TreeNode t = q.poll();
                temp.add(t.val);
                if(t.left != null){
                    q.offer(t.left);
                }
                if(t.right != null){
                    q.offer(t.right);
                }
            }
            res.add(temp);
        }
        return res;
    }
}