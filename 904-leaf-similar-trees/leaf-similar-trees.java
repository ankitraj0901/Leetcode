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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        Stack<TreeNode> s=new Stack<>();
        int arr[]=new int[200];
        int arr2[]=new int[200];
        int i=0;
        s.push(root1);
        while(!s.isEmpty()){
            TreeNode temp;
            temp=s.pop();
            if(temp.left==null && temp.right==null){
                arr[i]=temp.val;
                i++;
            }
            if(temp.right!=null){
                s.push(temp.right);
            }
            if(temp.left!=null){
                s.push(temp.left);
            }
        }

        int j=0;
        s.push(root2);
        while(!s.isEmpty()){
            TreeNode temp;
            temp=s.pop();
            if(temp.left==null && temp.right==null){
                arr2[j]=temp.val;
                j++;
            }
            if(temp.right!=null){
                s.push(temp.right);
            }
            if(temp.left!=null){
                s.push(temp.left);
            }
        }
        int result=i>j?i:j;
        for(int k=0;k<result;k++){
            if(arr[k]!=arr2[k])
                return false;
        }
        
        return true;
    }
}