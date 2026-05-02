class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        HashMap<Character,Integer> mp=new HashMap<>();
        int n=s.length();
        int maxlength=-1;
        int low=0;
        for(int high=0;high<n;high++){
          char ch=s.charAt(high);
          mp.put(ch,mp.getOrDefault(ch, 0) + 1);
          while(mp.size()>k){
            char leftchar=s.charAt(low);
            mp.put(leftchar,mp.get(leftchar)-1);
            if(mp.get(leftchar)==0){
                mp.remove(leftchar);
            }
            low++;
          }
          if(mp.size()==k){
              maxlength=Math.max(maxlength,high-low+1);
          }
        }
        return maxlength;
    }
}