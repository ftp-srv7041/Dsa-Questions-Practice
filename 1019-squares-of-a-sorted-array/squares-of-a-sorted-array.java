class Solution {
    public int[] sortedSquares(int[] arr) {
        int n=arr.length;
        int[] result=new int[n];
        int i=0; 
        int j=n-1;
        int k=n-1;
        while(i<=j){
            int left=arr[i]*arr[i];
            int right=arr[j]*arr[j];
            if(left>right){
                result[k]=left;
                i++;
            }
            else{
                result[k]=right;
                j--;
            }
            k--;
        }
        return result;
    }
}