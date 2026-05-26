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
    TreeNode ans=null;
    public TreeNode searchBST(TreeNode root, int val) {
        bst(root,val);
        return ans;
    }
    public void bst(TreeNode root,int val){
        if(root==null){
            return;
        }
        if(root.val==val){
            ans=root;
            return;
        }
        if(val>root.val){
            bst(root.right,val);
        }else{
            bst(root.left,val);
        }
    }
}