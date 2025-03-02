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
    public int sumNumbers(TreeNode root) {
        int sum1=0,sum2=0;
        if(root!=null){
            if(root.left!=null){
                root.left.val+=(root.val*10);
                sum1+=sumNumbers(root.left);
            }
           
            if(root.right!=null){
                root.right.val+=(root.val*10);
                sum2+=sumNumbers(root.right);
            }
            if(root.left==null && root.right==null)
                return root.val;
            return sum1+sum2;
        }
        return 0;
    }
}