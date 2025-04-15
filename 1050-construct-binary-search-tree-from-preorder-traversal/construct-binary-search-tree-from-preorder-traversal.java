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
    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root,node,temp;
        int i;
        node=new TreeNode(preorder[0]);
        root=node;
        for(i=1;i<preorder.length;i++){
            temp=root;
            node=new TreeNode(preorder[i]);
            while(temp!=null){
                if(preorder[i]<temp.val){
                    if(temp.left==null){
                        temp.left=node;
                        break;
                    }
                    else
                        temp=temp.left;
                }
                else{
                    if(temp.right==null){
                        temp.right=node;
                        break;
                    }
                    else
                        temp=temp.right;
                }
            }
        }
        return root;
    }
}