class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null){
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean leftToRight = true;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i  = 0; i < size; i++){
                temp.add(0);
            }
            int left = 0;
            int right = size - 1;
            while(size-- > 0){
                TreeNode t = q.poll();
                if(leftToRight){
                    temp.set(left, t.val);
                    left++;
                }else{
                    temp.set(right, t.val);
                    right--;
                }
                if(t.left != null){
                    q.offer(t.left);
                }
                if(t.right != null){
                    q.offer(t.right);
                }
            }
            res.add(temp);
            leftToRight = !leftToRight;        
        }
        return res;
    }
}