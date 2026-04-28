    class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
        return 0;
        int count=1;
        int i=0;
        int j=1;
        while(j<nums.length){
            if(nums[j]==nums[j-1]){
            j++;
            continue;
            }
            nums[i+1]=nums[j];
                i++;
                count++;
                j++;
        }
        return count;
    }
    }