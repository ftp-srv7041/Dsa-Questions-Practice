class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int largest=Integer.MIN_VALUE;
        int secondlargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }
            if(arr[i]>secondlargest&& arr[i]<largest){
                secondlargest=arr[i];
            }
        }
        return secondlargest;
    }
}