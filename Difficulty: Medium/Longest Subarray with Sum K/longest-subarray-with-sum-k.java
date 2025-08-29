class Solution {
    public int longestSubarray(int[] arr, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int maxlen=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==k){
                maxlen = Math.max(maxlen,i+1);
            }
            if(map.containsKey(sum - k)){
                int len = i - map.get(sum - k);
                maxlen = Math.max(maxlen, len);
            }
    
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        return maxlen;
    }
}
