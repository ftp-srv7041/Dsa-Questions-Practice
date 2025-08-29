class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        return false;
        int original=x;
        int reversedNumber=0;
        while(x>0){
            int digit=x%10;
            reversedNumber=reversedNumber*10+digit;
            x=x/10;
             //basically ye last se element hatata hai
        }
        return original==reversedNumber;
    }
}