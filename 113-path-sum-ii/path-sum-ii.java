class Solution {
    public List<List<Integer>> pathSum(TreeNode root,int targetSum) {
        List<List<Integer>> ans =new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        helper(root, targetSum,0,path,ans);
        return ans;
    }
    public void helper(TreeNode root,
                       int targetSum,
                       int sum,
                       List<Integer> path,
                       List<List<Integer>> ans) {

        if(root == null) {
            return;
        }
        // current node add
        sum += root.val;
        path.add(root.val);
        // leaf node
        if(root.left == null &&
           root.right == null) {
            if(sum == targetSum) {
                ans.add(new ArrayList<>(path));
            }
        }
        // left subtree
        helper(root.left,
               targetSum,
               sum,
               path,
               ans);
        // right subtree
        helper(root.right,
               targetSum,
               sum,
               path,
               ans);
        // backtracking
        path.remove(path.size() - 1);
    }
}