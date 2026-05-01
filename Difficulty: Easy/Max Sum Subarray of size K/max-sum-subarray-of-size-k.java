class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int n=arr.length;
        int sum=0;
        int maxsum=0;
        int low=0;
        int high=k-1;
        for(int i=low;i<=high;i++){
            sum+=arr[i];
        }
        while(high<n){
            maxsum=Math.max(maxsum,sum);
            low++;
            high++;
            if(high==n)
            break;
            sum=sum-arr[low-1];
            sum=sum+arr[high];
        }
        return maxsum;
    }
}