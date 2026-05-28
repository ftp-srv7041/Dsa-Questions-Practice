class Solution {

    public int maxDepth(TreeNode root) {

        // base case
        if(root == null) {
            return 0;
        }

        // left subtree height
        int leftHeight =
            maxDepth(root.left);

        // right subtree height
        int rightHeight =
            maxDepth(root.right);

        // current height
        return 1 +
               Math.max(leftHeight,
                        rightHeight);
    }
}