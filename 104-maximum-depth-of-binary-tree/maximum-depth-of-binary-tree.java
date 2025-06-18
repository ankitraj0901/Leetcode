/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int max_depth = 0;
        while (!q.isEmpty()){
            int size = q.size();
            max_depth++;
            for (int i = 0; i < size; i++){
                TreeNode temp = q.poll();
                
                if (temp.left != null){
                    q.add(temp.left);
                }
                if (temp.right != null){
                    q.add(temp.right);
                }
            }
        }
        System.out.println(max_depth);
        return max_depth;
    }
}