class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int breaks = 0;

        for (int i = 0; i < n; i++) {
            int next = (i + 1) % n;

            if (nums[i] > nums[next]) {
                breaks++;
            }

            if (breaks > 1) {
                return false;
            }
        }

        return true;
    }
}
