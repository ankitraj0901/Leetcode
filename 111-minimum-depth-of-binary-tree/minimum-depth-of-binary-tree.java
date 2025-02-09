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
    public int minDepth(TreeNode root) {
        int count1=0,count2=0;
        if(root==null){
            return 0;
        }
        count1++;count2++;
        count1+=minDepth(root.left);
        count2+=minDepth(root.right);
        if(root.left==null)
            return count2;
        else if(root.right==null)
            return count1;
        return count1<count2?count1:count2;
        
    }
}