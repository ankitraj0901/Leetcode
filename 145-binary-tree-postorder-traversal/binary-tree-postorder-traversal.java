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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();   
        inorder(root,list);
        return list;
    }
    public void inorder(TreeNode temp,List<Integer> list){
        if(temp!=null){
            inorder(temp.left,list);
            inorder(temp.right,list);
            list.add(temp.val);
        }
    }
}