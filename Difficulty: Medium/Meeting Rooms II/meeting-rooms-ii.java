class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        // code here
        Arrays.sort(start);
        Arrays.sort(end);
        int i = 0;
        int j = 0;
        int rooms = 0;
        int max=0;
        while (i < start.length) {
            if (start[i] < end[j]) {
                rooms++;
                max=Math.max(max,rooms);
                i++;
            }else{
                j++;
                rooms--;
            }
        }
            return max;
    }
}
