class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result=new ArrayList<>();
        boolean inserted=false;
        for(int i=0;i<intervals.length;i++){
            int start=intervals[i][0];
            if(start>=newInterval[0] && !inserted){
                result.add(newInterval);
                inserted=true;
            }
            result.add(intervals[i]);
        }
        // edge case if newinterval comes to end
        if(!inserted){
            result.add(newInterval);
        }
        int[][] arr=result.toArray(new int[0][]);
        return merge(arr);
    }
    // merge code
    public int [][] merge(int[][] nums){
        Arrays.sort(nums,(a,b)->a[0]-b[0]);
        List<int[]> ans=new ArrayList<>();
        int start1=nums[0][0];
        int end1=nums[0][1];
        for(int i=1;i<nums.length;i++){
            int start2=nums[i][0];
            int end2=nums[i][1];
            if(end1>=start2){
                start1=start1;
                end1=Math.max(end1,end2);
                continue;
            }else{
                ans.add(new int[]{start1,end1});
                start1=start2;
                end1=end2;
            }
        }
        ans.add(new int[]{start1,end1});
        return ans.toArray(new int[0][]);
    }
}