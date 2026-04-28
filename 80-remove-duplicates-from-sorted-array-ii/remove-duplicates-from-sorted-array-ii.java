class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
        return 0;

       int i=0;
       int j=1;
       int count=1;
       int result=1;
       while(j<nums.length){
        if(nums[j]==nums[j-1]){
        count++;
        }
        else{
            count=1;
        }if(count<=2){
            nums[i+1]=nums[j];
            i++;
            result++;
        }
        j++;
       }
    return result;
    }
}