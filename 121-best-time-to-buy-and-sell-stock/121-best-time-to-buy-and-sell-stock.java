class Solution {
    public int maxProfit(int[] prices) {
          int value = 0;
       int min = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if(prices[i] > min){
                value = Math.max(value,prices[i] - min);
            }
            else {
                min = prices[i];
            }
        }
        return value;
    }
}