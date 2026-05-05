// User function Template for Java

class Solution {
    static int smallestSumSubarray(int arr[], int size) {
        // your code here
        int bestending=arr[0];
        int minsum=arr[0];
        for(int i=1;i<arr.length;i++){
            int choice1=bestending+arr[i];
            int choice2=arr[i];
            bestending=Math.min(choice1,choice2);
            minsum=Math.min(minsum,bestending);
        }
        return minsum;
    }
}