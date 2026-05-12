class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] nums) {
        // code here
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();
        result[n - 1] = -1;
        st.push(nums[n - 1]);
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() >= nums[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = st.peek();
            }
            st.push(nums[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int num : result) {
            ans.add(num);
        }

        return ans;
    }
}