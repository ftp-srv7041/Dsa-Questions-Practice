class Solution {
    public int missingNumber(int[] nums) {
      int sum=0;
      int actualsum=0;
      int result=0;
      int n=nums.length;
      for(int i=0;i<n;i++){
        sum+=nums[i];
        actualsum=n*(n+1)/2;
        result=actualsum-sum;
      } 
      return result; 
    }   
}