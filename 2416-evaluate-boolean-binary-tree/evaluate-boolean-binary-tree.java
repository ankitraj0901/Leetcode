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
    public boolean evaluateTree(TreeNode root) {
        boolean temp1=false,temp2=false;
        if(root!=null){
            if(root.left!=null){
                temp1=evaluateTree(root.left);
            }
            if(root.right!=null){
                temp2=evaluateTree(root.right);
            }
            if(root.left==null && root.right==null){
                if(root.val==0)
                    return false;
                if(root.val==1)
                    return true;
            }
            if(root.val==3){
                return temp1 && temp2;
            }
            else
                return temp1 || temp2;
        }
        return false;
    }
}