class Solution {
    public int maxProfit(int[] prices) {
        int min_price = prices[0];
        int max_profit = 0;
        for(int i = 1; i < prices.length; i++)
        {
            int today_profit = prices[i] - min_price;
            if(prices[i] < min_price)
            {
                min_price = prices[i];
            }
            else if( today_profit > max_profit)
            {
                max_profit = today_profit;
            }
        }

        return max_profit;
    }
}