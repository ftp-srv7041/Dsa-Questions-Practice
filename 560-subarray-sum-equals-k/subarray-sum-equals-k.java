class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        // special condition 0 ki freq hamesha 1 hogi kyuki nums se phele 0 hoga hi
        mp.put(0,1);
      int count=0;
      int sum=0;
        for(int num:nums){
            sum+=num;
            if(mp.containsKey(sum-k)){
                count+=mp.get(sum-k);
            }
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
