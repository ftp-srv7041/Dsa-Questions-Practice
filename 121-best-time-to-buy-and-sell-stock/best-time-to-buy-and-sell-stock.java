class Solution {
    public int maxProfit(int[] prices) {
        int buystock=prices[0];
        int maxprofit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<buystock){
                buystock=prices[i];
            }
            else
            {
                int currentprofit=prices[i]-buystock;
                 maxprofit=Math.max(maxprofit,currentprofit);
            }
        }
        return maxprofit;
    }
}