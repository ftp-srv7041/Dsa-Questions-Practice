class Solution {
    public int removeDuplicates(int[] arr) {
        int count = 0;
        if (arr.length == 0) return 0;

        for (int i = 0; i < arr.length - 1; i++) {
           if(arr[i]==arr[i+1]){
            continue;
           }
           else{
            arr[count]=arr[i];
            count++;
           }
        }
        arr[count]=arr[arr.length-1];//handle the last element
        count++;
        return count;
    }
}
