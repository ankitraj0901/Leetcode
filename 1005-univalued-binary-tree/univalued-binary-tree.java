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
    public boolean isUnivalTree(TreeNode root) {
        boolean temp;
        if(root==null)
            return false;
        if(root!=null){
            if(root.left!=null){
                if(root.left.val!=root.val)
                    return false;
            temp=isUnivalTree(root.left);
            if(temp==false)
                if(root.left!=null)
                    return false;
            }
            if(root.right!=null){
                if(root.right.val!=root.val)
                    return false;
            temp=isUnivalTree(root.right);
            if(temp==false)
                if(root.right!=null)
                    return false;
            }
        }
        return true;
    }
}