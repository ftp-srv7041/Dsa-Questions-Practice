class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalsum=nums[0];
        int bestendingmax=nums[0];
        int maxsum=nums[0];
        int bestendingmin=nums[0];
        int minsum=nums[0];
        for(int i=1;i<nums.length;i++){
            bestendingmax=Math.max(nums[i],bestendingmax+nums[i]);
            maxsum=Math.max(maxsum,bestendingmax);
            bestendingmin=Math.min(nums[i],bestendingmin+nums[i]);
            minsum=Math.min(minsum,bestendingmin);
            // for circular
            totalsum+=nums[i];
        }
        // if all negative edge case
        if(maxsum<0)
        return maxsum;
        return Math.max(maxsum,totalsum-minsum);
    }
}