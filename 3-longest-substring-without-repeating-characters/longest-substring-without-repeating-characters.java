class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int low = 0;
        int maxlength = 0;   
        HashMap<Character,Integer> mp = new HashMap<>();
        for(int high = 0; high < n; high++){
            char ch = s.charAt(high);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
            int k = high - low + 1;

            while(mp.size() < k){
                char left = s.charAt(low);

                mp.put(left, mp.get(left) - 1);
                if(mp.get(left) == 0){
                    mp.remove(left);
                }

                low++;
                k = high - low + 1;
            }

            maxlength = Math.max(maxlength, high - low + 1);
        }

        return maxlength; 
    }
}