class Solution {
    public String minWindow(String s, String t) {
        int[] freq=new int[256];
        for(char c:t.toCharArray()){
            freq[c]++;
        }
        int low=0;
        int count=0;
        int minlen=Integer.MAX_VALUE;
        int start=0;
        count=t.length();
        
        for(int high=0;high<s.length();high++){
            char ch=s.charAt(high);

            if(freq[ch]>0){
                count--;
            }
            freq[ch]--;

            while(count==0){
                if(high-low+1<minlen){
                    minlen=high-low+1;
                    start=low;
                }
                char left=s.charAt(low);
                freq[left]++;

                if(freq[left]>0){
                    count++;
                }
                low++;
            }
        }
        if(minlen==Integer.MAX_VALUE)
        return "";
        return s.substring(start,start+minlen);
    }
}