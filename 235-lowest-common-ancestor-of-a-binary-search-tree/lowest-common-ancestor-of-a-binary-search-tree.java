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
    TreeNode ans=null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        bestLCA(root,p,q);
        return ans;
    }
    public void bestLCA(TreeNode root,TreeNode p,TreeNode q){
        if(root==null){
            return;
        }
        // case1
        if(root==p||root==q){
            ans=root;
            return;
        }
        // case2
        if(root.val<p.val&&root.val<q.val){
            bestLCA(root.right,p,q);
        }
        // case 3
        else if(root.val>p.val&&root.val>q.val){
            bestLCA(root.left,p,q);
        }
        // case4
        else{
            ans=root;
            return; 
        }
    }
}