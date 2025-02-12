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
    public boolean hasPathSum(TreeNode root, int targetSum) {
    if (root == null) {
        return false;
    }
    if (root.left == null && root.right == null) {
        return root.val == targetSum;
    }
    if (root.left != null) {
        root.left.val = root.val + root.left.val;
        if (hasPathSum(root.left, targetSum)) {
            return true;
        }
    }
    if (root.right != null) {
        root.right.val = root.val + root.right.val;
        if (hasPathSum(root.right, targetSum)) {
            return true;
        }
    }
    return false;
    }
}