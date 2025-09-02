class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int n=arr.length;
        int maxsum=arr[0];
        int currsum=arr[0];
        for(int i=1;i<n;i++){
            currsum=Math.max(arr[i],currsum+arr[i]);
            maxsum=Math.max(currsum,maxsum);
        }
        
        return maxsum;
    }
}
