/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        TreeNode temp;
        if(cloned!=null){
            if(target.val==cloned.val)
                return cloned;
            temp=getTargetCopy(original,cloned.left,target);
            if(temp!=null)
                return temp;
            temp=getTargetCopy(original,cloned.right,target);
            if(temp!=null)
                return temp;
        }
        return null;
    }
}