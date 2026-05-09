class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        int zerocount=0;
        int onecount=0;
        int len=0;
        int maxlen=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
            zerocount++;
            }else{
            onecount++;
            }
            int diff=zerocount-onecount;
            if(diff==0){
                len=Math.max(len,i+1);
                maxlen=Math.max(maxlen,len);
                continue;
            }
            if(!(mp.containsKey(diff))){
                mp.put(diff,i);
            }
            else{
              int idx=mp.get(diff);
              len=i-idx;
              maxlen=Math.max(maxlen,len);
            }
        }
        return maxlen;
    }
}