package com.practise.leetcode.arrays;

public class MaxProfitMultipleTransactions {
    public int getMaxProfit(int[] prices){
        int maxProfit = 0;
        for(int i=1; i<prices.length; i++){
            if(prices[i] > prices[i-1]){
                maxProfit+= prices[i] - prices[i-1];
            }
        }
        return maxProfit;
    }
}
