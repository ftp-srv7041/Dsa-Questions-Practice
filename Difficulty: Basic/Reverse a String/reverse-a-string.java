// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        return helper(s, 0, s.length() - 1);
    }
    public static String helper(String s, int low, int high) {
        // base case
        int len = high - low + 1;
        if(len == 0 || len == 1) {
            return s.substring(low, high + 1);
        }
        return s.charAt(high) + helper(s, low + 1, high - 1) + s.charAt(low);
    }
}