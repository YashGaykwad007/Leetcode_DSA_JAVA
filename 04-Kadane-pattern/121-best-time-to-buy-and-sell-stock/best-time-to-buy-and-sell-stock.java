class Solution {
    public int maxProfit(int[] prices) {
        int Buying = prices[0];
        int Selling = prices[0];
        int maxprofit = 0;
        for(int i = 0;i<prices.length;i++){
            int v1 = prices[i];
            if(v1<Buying){
                Buying = v1;
            }
            int profit = v1-Buying;
            maxprofit = Math.max(profit,maxprofit);
            
        }
        return maxprofit;
    }
}