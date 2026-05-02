class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n=fruits.length;
        int low=0;
        int maxlength=-1;
        for(int high=0;high<n;high++){
            int ful=fruits[high];
            mp.put(ful,mp.getOrDefault(ful,0)+1);
            while(mp.size()>2){
                int left=fruits[low];
                mp.put(left,mp.get(left)-1);
                if(mp.get(left)==0){
                    mp.remove(left);
                }
                low++;
            }
            maxlength=Math.max(maxlength,high-low+1);
        }
        return maxlength;
    }
}