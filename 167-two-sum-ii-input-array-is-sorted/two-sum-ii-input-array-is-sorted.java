class Solution {
    public int[] twoSum(int[] nums, int target) {
      int n=nums.length;
      int low=0;
      int high=n-1;
      int sum=0;
      int count=0;
      while(low<high){
        sum=nums[low]+nums[high];
        if(sum==target){
            return new int[]{low+1,high+1};
        }
        else if(sum<target){
            low++;
        }
        else{
            high--;
        }
      }  
      return new int[]{-1,-1};
    }
}