class Solution {
    public int[] rearrangeArray(int[] nums) {
       int[] result=new int[nums.length];
       int pos=0;
       int neg=1;
       for(int ele:nums){
        if(ele>0){
            result[pos]=ele;
            pos+=2;
        }
        else{
            result[neg]=ele;
            neg+=2;
        }
       } 
       return result;
    }
}