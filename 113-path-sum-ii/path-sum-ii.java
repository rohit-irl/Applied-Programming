class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
      List<List<Integer>> res = new ArrayList<>();
      List<Integer> diary = new ArrayList<>();
      fun(root, targetSum, 0, diary, res);
      return res;
    }
    void fun(TreeNode root, int targetSum, int sum, List<Integer> diary, List<List<Integer>> res){
        if(root == null){
            return;
        }
        sum = sum + root.val;
        diary.add(root.val);
        if(root.left == null && root.right == null){
            if(sum == targetSum){
                res.add(new ArrayList<>(diary));
            }
        }else{
            fun(root.left, targetSum, sum, diary, res);
            fun(root.right, targetSum, sum, diary, res);
        }
        diary.remove(diary.size() - 1);
    }
}