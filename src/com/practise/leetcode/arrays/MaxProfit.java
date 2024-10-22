package com.practise.leetcode.arrays;

public class MaxProfit {
    public int getMaxProfit(int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        MaxProfit maxProfit = new MaxProfit();
        int[] prices = {7,1,5,3,6,4};
        System.out.printf("max profit is : %1$d", maxProfit.getMaxProfit(prices));
    }
}
