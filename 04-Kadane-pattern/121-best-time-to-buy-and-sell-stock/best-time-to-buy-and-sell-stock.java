class Solution {
    public int maxProfit(int[] prices) {
        int Buying = prices[0];
        int Selling = prices[0];
        int maxprofit = 0;
        for(int i = 0;i<prices.length;i++){
            int v1 = prices[i];
            if(v1<Buying){//if the current price is less than the main buying prices than the new price became the buying price
                Buying = v1;
            }
            int profit = v1-Buying;//for calculating the profit buying price - selling price;
            maxprofit = Math.max(profit,maxprofit);//using max to find the maximum profit
            
        }
        return maxprofit;
    }
}