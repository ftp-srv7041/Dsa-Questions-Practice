class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int bestendingmin = nums[0];
        int bestendingmax = nums[0];
        int minsum = nums[0];
        int maxsum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            bestendingmin = Math.min(nums[i], bestendingmin + nums[i]);
            minsum = Math.min(minsum, bestendingmin);
            bestendingmax = Math.max(nums[i], bestendingmax + nums[i]);
            maxsum = Math.max(maxsum, bestendingmax);
        }
        return Math.max(Math.abs(minsum), Math.abs(maxsum));
    }
}