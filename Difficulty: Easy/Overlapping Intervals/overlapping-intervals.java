class Solution {
    static boolean isIntersect(int[][] arr) {
        // Code Here
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        int start1=arr[0][0];
        int end1=arr[0][1];
        for(int i=1;i<arr.length;i++){
            int start2=arr[i][0];
            int end2=arr[i][1];
            if(end1>=start2){
                return true;
            }
            start1=start1;
            end1=Math.max(end1,end2);
        }
        return false;
    }
}