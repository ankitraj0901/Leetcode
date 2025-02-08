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
    public int maxDepth(TreeNode root){
        int count1=0;
        int count2=0;
        if(root==null){
            return 0;
        }
        count1++;
        count2++;
        count1+=maxDepth(root.left);
        count2+=maxDepth(root.right);
        return count1>count2?count1:count2;
        
    }
}