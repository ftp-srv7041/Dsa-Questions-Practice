class Solution {
    void segregate0and1(int[] arr) {
        // code here
        int i=0;
        int j=0;
        int n=arr.length;
        if(arr.length==0)
        return;
        while(j<n){
            if(arr[j]==1){
                j++;
                continue;
            }
            else{
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
                i++;
            }
        }
    }
}
