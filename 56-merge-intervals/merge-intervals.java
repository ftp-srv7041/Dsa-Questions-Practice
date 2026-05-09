class Solution {
    public int[][] merge(int[][] nums) {
        Arrays.sort(nums,(a,b)->a[0]-b[0]);
        List<int[]> result=new ArrayList<>();
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
            result.add(new int[]{start1,end1});
            start1=start2;
            end1=end2;
            }
        }
        result.add(new int[]{start1,end1});
        return result.toArray(new int[0][]);
    }
}