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
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null && root2==null)
            return root1;
        else if(root2==null)
            return root1;
        else if(root1==null)
            return root2;
        root1.val=root1.val+root2.val;
        mergeTrees(root1.left,root2.left);
        if(root1.left==null)
            root1.left=root2.left;
        mergeTrees(root1.right,root2.right);
        if(root1.right==null)
            root1.right=root2.right;
        return root1;
    }
}