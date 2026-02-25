class Solution {
    public int maxProfit(int[] prices) {

        int maxprofit = 0;
        int minval = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minval) {
                minval = prices[i];
            }
            int profit = prices[i] - minval;
            maxprofit = Math.max(profit, maxprofit); 
        }
        return maxprofit;
    }
}