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

    int res = 0;

    public int diameterOfBinaryTree(TreeNode root) {

        height(root);

        return res;
    }

    public int height(TreeNode root) {

        // base case
        if(root == null) {
            return 0;
        }

        // left subtree height
        int leftHeight =
            height(root.left);

        // right subtree height
        int rightHeight =
            height(root.right);

        // current diameter
        int sum =
            leftHeight + rightHeight;

        // maximum diameter
        res = Math.max(res, sum);

        // return current height
        return 1 +
               Math.max(leftHeight,
                        rightHeight);
    }
}