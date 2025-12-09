class Solution {
    public int removeDuplicates(int[] nums) {
        int count=0;
        int n=nums.length;
        if(n==0)
        return 0;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                continue;
            }
            nums[count]=nums[i];
            count++;
        }
        nums[count]=nums[n-1];
        count++;
        return count;
    }
}