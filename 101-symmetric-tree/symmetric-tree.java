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
    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return false;
        else if(root.left==null && root.right==null)
            return true;
        else if(root.left==null)
            return false;
        else if(root.right==null)
            return false;
        else if(root.left.val!=root.right.val)
            return false;
        Queue<TreeNode> q1=new LinkedList<>();
        Queue<TreeNode> q2=new LinkedList<>();
        TreeNode temp1=null,temp2=null;
        q1.add(root.left);
        q2.add(root.right);
        while(!q1.isEmpty() && !q2.isEmpty()){
            if(q1.size()!=q2.size())
                return false;
            for(int i=0;i<q1.size();i++){
                temp1=q1.remove();
                temp2=q2.remove();
                if(temp1.val==temp2.val){
                    if(temp1.left!=null && temp2.right!=null){
                        q1.add(temp1.left);
                        q2.add(temp2.right);
                    }
                    else if(temp1.left==null && temp2.right!=null || temp1.left!=null && temp2.right==null)
                        return false;
                    if(temp1.right!=null && temp2.left!=null){
                        q1.add(temp1.right);
                        q2.add(temp2.left);
                    }
                    else if(temp1.right==null && temp2.left!=null || temp1.right!=null && temp2.left==null)
                        return false;
                }
                else
                    return false;
                
            }

        }
        return true;

    }
}