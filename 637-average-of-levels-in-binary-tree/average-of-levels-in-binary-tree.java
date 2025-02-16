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
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> list=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        long sum=0;
        double result;
        TreeNode temp=null;
        q.add(root);
        while(!q.isEmpty()){
            double size=q.size();
            sum=0;
            for(int i=0;i<size;i++){
                if(q.peek().left!=null){
                    q.add(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.add(q.peek().right);
                }
                //System.out.print(q.peek().val);
                sum+=q.peek().val;
                q.remove();
            }
            System.out.println(sum);
            result=sum/size;
            list.add(result);
        }
        return list;
    }
}