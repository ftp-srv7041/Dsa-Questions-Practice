class Solution {
    public int maxSubArray(int[] nums) {
     int bestending=nums[0];
     int maxsum=nums[0];
     for(int i=1;i<nums.length;i++){
        int choice1=bestending+nums[i];
        int choice2=nums[i];
        bestending=Math.max(choice1,choice2);
        maxsum=Math.max(maxsum,bestending);
     }   
     return maxsum;
    }
}