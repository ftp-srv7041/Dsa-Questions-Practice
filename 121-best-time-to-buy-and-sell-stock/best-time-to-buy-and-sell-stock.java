class Solution {
    public int maxProfit(int[] prices) {
       int n=prices.length;
       int buystock=prices[0];
       int sellstock=0;
       for(int i=1;i<n;i++){
        if(prices[i]<buystock){
            buystock=prices[i];
        }
        sellstock=Math.max(prices[i]-buystock,sellstock);
       } 
       return sellstock;
    }
}