class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> mp1=new HashMap<>();
        HashMap<Character,Integer> mp2=new HashMap<>();
        for(int i=0;i<ransomNote.length();i++){
            char ch1=ransomNote.charAt(i);
            mp1.put(ch1,mp1.getOrDefault(ch1,0)+1);
        }
         for(int i=0;i<magazine.length();i++){
            char ch2=magazine.charAt(i);
            mp2.put(ch2,mp2.getOrDefault(ch2,0)+1);
        }
        for(char ch:mp1.keySet()){
            if(!mp2.containsKey(ch)||mp2.get(ch)<mp1.get(ch)){
                return false;
            }
        }
        return true;
    }
}