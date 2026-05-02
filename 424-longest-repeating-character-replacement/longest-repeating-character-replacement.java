class Solution {
    public int characterReplacement(String s, int k) {
       HashMap<Character,Integer> mp=new HashMap<>();
       int low=0;
       int n=s.length();
       int maxfreq=0;
       int ans=0;
       for(int high=0;high<n;high++){
        char ch=s.charAt(high);
        mp.put(ch,mp.getOrDefault(ch,0)+1);
        maxfreq=Math.max(maxfreq,mp.get(ch));
        while((high-low+1)-maxfreq>k){
            char left=s.charAt(low);
            mp.put(left,mp.get(left)-1);
            low++;
        }
         ans=Math.max(ans,high-low+1);
       }
       return ans;
    }
}