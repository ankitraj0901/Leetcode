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
    public TreeNode searchBST(TreeNode root, int val) {
        TreeNode temp=null;
        if(root!=null){
            if(root.val==val)
                return root;
            temp=searchBST(root.left,val);
            if(temp!=null)
                return temp;
            temp=searchBST(root.right,val);
            if(temp!=null)
                return temp;
        }
        return null;
    }
}