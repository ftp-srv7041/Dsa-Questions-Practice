class Solution {
    static int sumOfDigits(int n) {
        // code here
    return sum(n);   
    }
    public static int sum(int n){
        if(n==0)
        return 0;
        int d=n%10;
        n=n/10;
        int ans=sum(n);
        return ans+d;
    }
}
