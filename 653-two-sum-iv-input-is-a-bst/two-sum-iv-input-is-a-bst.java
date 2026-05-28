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
    HashSet<Integer> set=new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        // base case
        if(root==null){
            return false;
        }
        // agar mil jata hai x+y=k
        // x=k-y
        if(set.contains(k-root.val)){
            return true;
        }
        // agar set mein nhi mila to add kro 
        set.add(root.val);
        // DFS kro left and right side pe
        return findTarget(root.left,k)||findTarget(root.right,k);
    }
}