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
        boolean flag=false;
        if(root==null)
            return false;
        else if (root.left==null && root.right==null){
            if(root.val==targetSum)
                return true;
        }
        // else if (root.left!=null || root.right!=null){
        //     if(root.val==targetSum)
        //         return false;
        // }
        if(root.left!=null){
            // if(root.val==targetSum && root.left.val!=0)
            //     return false;
            root.left.val=root.val+root.left.val;
            flag=hasPathSum(root.left,targetSum);
            if(flag==true)
                return true;
        }
        if(root.right!=null){
            // if(root.val==targetSum && root.right.val!=0)
            //     return false;
            root.right.val=root.val+root.right.val; 
            flag=hasPathSum(root.right,targetSum);
            if(flag==true)
                return true;
        }
        // if(root.val==targetSum){
        //     return true;
        // }
        return false;
    }
}