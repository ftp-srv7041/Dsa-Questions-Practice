class Solution {
    public static ArrayList<Integer> prevSmaller(int[] nums) {
        // code here
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();
        result[0] = -1;
        st.push(nums[0]);
        for (int i = 1; i<n ; i++) {
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