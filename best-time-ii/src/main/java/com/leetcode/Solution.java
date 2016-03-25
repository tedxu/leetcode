package com.leetcode;

public class Solution {
  public int maxProfit(int[] prices) {
    int profit = 0;
    boolean holding = false;    // In case our cost is actually 0.
    int cost = 0;
    for (int i = 0; i < prices.length - 1; i++) {
      if (prices[i + 1] > prices[i] && !holding) {
        // Price go higher, buy in
        cost = prices[i];
        holding = true;
      } else if (prices[i + 1] < prices[i] && holding) {
        // Price go down , sell out
        profit += (prices[i] - cost);
        cost = 0;
        holding = false;
      }
    }

    if (holding) {
      // Price should go higher
      profit += (prices[prices.length - 1] - cost);
    }
    
    return profit;
  }
}