class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int gola_index=-1;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                gola_index=i;
                break;
            }
        }
            if(gola_index==-1){
                reverse(nums,0,n-1);
                return;
            }
        
        for (int i = n - 1; i > gola_index; i--) {
            if (nums[i] > nums[gola_index]) {  
                swap(nums, i, gola_index);     
                break;
            }
        }
        reverse(nums,gola_index+1,n-1);
    }
    public void swap(int[] nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public void reverse(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}