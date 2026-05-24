class Solution {

    public void removeCharacter(StringBuilder s, char c) {

        helper(s, 0, c);
    }

    public void helper(StringBuilder s, int i, char c) {

        // base case
        if(i == s.length()) {
            return;
        }

        // agar character match hua
        if(s.charAt(i) == c) {

            s.deleteCharAt(i);

            // same index pe recurse
            helper(s, i, c);
        }
        else {

            // next index
            helper(s, i + 1, c);
        }
    }
}