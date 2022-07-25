class Solution {
    public int maxProfit(int[] prices) {
        
        // Brute Force O(n^2):
        /*
        int max_profit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if ((prices[j] - prices[i]) > max_profit) {
                    max_profit = prices[j] - prices[i];
                }
            }
        }
        return max_profit;
        */
        
        // One Pass O(n):
        int min_price = prices[0];
        int max_profit = 0;
        
        for (int i = 0; i < prices.length; i++)  {
            if (prices[i] < min_price) {
                min_price = prices[i];
            } else if ((prices[i] - min_price) > max_profit) {
                max_profit = prices[i] - min_price;
            }
        }
        return max_profit;
    }
}
