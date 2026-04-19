class Solution {
    public int maxProfit(int[] prices) {
        int buy = 0;
        int maxProfit = 0;
        for(int i = 1 ; i < prices.length ; i++)
        {
            if(prices[i] < prices[buy])
            {
                buy = i;
            }
            else{
                int currentProfit = prices[i] - prices[buy];
                if (currentProfit > maxProfit) {
                    maxProfit = currentProfit;
                }
            }
        }
        return maxProfit;
    }
}

