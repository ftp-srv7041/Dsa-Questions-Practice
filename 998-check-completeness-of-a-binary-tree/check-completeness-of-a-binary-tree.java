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
    public boolean isCompleteTree(TreeNode root) {
        // empty tree
       if(root==null){
        return true;
       } 
       Queue<TreeNode>q=new LinkedList<>();
       q.offer(root);
       boolean nullseen=false;
       while(!q.isEmpty()){
        TreeNode curr=q.poll();
        if(curr==null){
            nullseen=true;
        }else{
            // node found after null
            if(nullseen){
                return false;
            }
            // push children
            q.offer(curr.left);
            q.offer(curr.right);
        }
       }
       return true;
    }
}