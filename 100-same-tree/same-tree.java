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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)
            return true;
        else if(p==null && q!=null)
            return false;
        else if(q==null && p!=null)
            return false;
        Queue<TreeNode> q1=new LinkedList<>();
        Queue<TreeNode> q2=new LinkedList<>();
        q1.add(p);
        q2.add(q);
        while(!q1.isEmpty() && !q2.isEmpty()){
            TreeNode s1,s2;
            int size;
            if(q1.size()==q2.size())
                size=q1.size();
            else
                return false;
            for(int i=0;i<size;i++){
                s1=q1.remove();
                s2=q2.remove();
                if(s1.val==s2.val){
                    if(s1.right!=null && s2.right!=null){
                        q1.add(s1.right);
                        q2.add(s2.right);
                    }
                    else if(s1.right==null && s2.right!=null || s1.right!=null && s2.right==null)
                        return false;
                    if(s1.left!=null && s2.left!=null){
                        q1.add(s1.left);
                        q2.add(s2.left);
                    }
                    else if(s1.left==null && s2.left!=null || s1.left!=null && s2.left==null)
                        return false;
                }
                else
                    return false;
            }
        }
        return true;
    }
}