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
    public int sumOfLeftLeaves(TreeNode root) {
        int temp1=0,temp2=0;
        if(root!=null){
            if(root.left!=null){
                if(root.left.left==null && root.left.right==null)
                    temp1=root.left.val;
                temp1+=sumOfLeftLeaves(root.left);
            }
            if(root.right!=null){
                temp2+=sumOfLeftLeaves(root.right);
            }
            return temp1+temp2;
        }
        return 0;
    }
}