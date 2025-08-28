class Solution {
    public boolean isHappy(int n) {
        Set<Integer> mp=new HashSet<>();
        while(n!=1){
            if(mp.contains(n)){
                return false;
            }
            else{
                mp.add(n);
            }
            n=calsquare(n);
        }
        return true;
    }
     public int calsquare(int num){
           int sum=0;
           while(num!=0){
            int rem=num%10;
            sum+=rem*rem;
            num=num/10;
           } 
           return sum;
        }
}