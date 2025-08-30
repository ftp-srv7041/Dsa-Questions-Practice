class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int i = 0, j = 0;
        double maxSum = Double.NEGATIVE_INFINITY;
            int windowSum = 0;
            while (j - i < k && j < n) {
                windowSum += nums[j];
                j++;
            }
              maxSum = Math.max(maxSum, windowSum);

            while(j<n) { 
               windowSum+=nums[j]-nums[i];
               maxSum = Math.max(maxSum, windowSum);
                j++;
                i++;
            }
        // Divide by k to get average
        return maxSum / k;
    }
}
