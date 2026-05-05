class Solution {
    public int maxProduct(int[] nums) {
        int result=nums[0];
        int maxprod=nums[0];
        int minprod=nums[0];
        for(int i=1;i<nums.length;i++){
            int choice1=nums[i];
            int choice2=maxprod*nums[i];
            int choice3=minprod*nums[i];
            maxprod=Math.max(choice1,Math.max(choice2,choice3));
            minprod=Math.min(choice1,Math.min(choice2,choice3));
            result=Math.max(result,Math.max(maxprod,minprod));
        }
        return result;
    }
}