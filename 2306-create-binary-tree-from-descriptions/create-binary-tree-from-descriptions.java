
class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        
        HashMap<Integer, TreeNode> map = new HashMap<>();
        HashSet<Integer> children = new HashSet<>();

        for (int[] des : descriptions){
            int parent = des[0];
            int child = des[1];
            boolean isLeft = des[2] == 1;

            map.putIfAbsent(parent, new TreeNode(parent));
            map.putIfAbsent(child, new TreeNode(child));

            TreeNode parentNode = map.get(parent);
            TreeNode childNode = map.get(child);

            if (isLeft) {
                parentNode.left = childNode;
            } else {
                parentNode.right = childNode;
            }
            children.add(child);
        }

        for (int[] des : descriptions) {
            int parent = des[0];
            if (!children.contains(parent)) {
                return map.get(parent);
            }
        }
        return null;
    }
}