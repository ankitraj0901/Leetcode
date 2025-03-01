import java.util.ArrayList;
import java.util.Collections;
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
    public TreeNode increasingBST(TreeNode root) {
        TreeNode root1=null,temp1=null;
        Stack<TreeNode> s=new Stack<>();
        ArrayList<Integer> list=new ArrayList<Integer>();
        s.push(root);
        while(!s.isEmpty()){
            TreeNode temp;
            temp=s.pop();
            if(temp.right!=null){
                s.push(temp.right);
            }
            if(temp.left!=null){
                s.push(temp.left);
            }
            list.add(temp.val);
        }
        Collections.sort(list);
        for(int i=0;i<list.size();i++){
            TreeNode node=new TreeNode(list.get(i));
            if(root1==null){
                root1=node;
                temp1=node;
            }
            else{
                temp1.right=node;
                temp1=temp1.right;
            }
        }
        root=root1;
        return root;
    }
}