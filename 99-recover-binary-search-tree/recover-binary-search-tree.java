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

    TreeNode prev = null;

    TreeNode g1_first = null;
    TreeNode g1_second = null;

    TreeNode g2_first = null;
    TreeNode g2_second = null;

    int count = 0;

    public void recoverTree(TreeNode root) {

        fun(root);

        // Adjacent nodes swapped
        if(count == 1) {

            int temp = g1_first.val;
            g1_first.val = g1_second.val;
            g1_second.val = temp;
        }

        // Non-adjacent nodes swapped
        else if(count == 2) {

            int temp = g1_first.val;
            g1_first.val = g2_second.val;
            g2_second.val = temp;
        }
    }

    public void fun(TreeNode root) {

        // base case
        if(root == null) {
            return;
        }

        // left subtree
        fun(root.left);

        // process current node
        if(prev != null && root.val < prev.val) {

            // first violation
            if(count == 0) {

                g1_first = prev;
                g1_second = root;
            }

            // second violation
            else {

                g2_first = prev;
                g2_second = root;
            }

            count++;
        }

        // update prev
        prev = root;

        // right subtree
        fun(root.right);
    }
}