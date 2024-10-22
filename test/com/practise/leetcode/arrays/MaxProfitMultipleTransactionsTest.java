package com.practise.leetcode.arrays;

import com.practise.algorithms.sort.BubbleSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxProfitMultipleTransactionsTest {

    @Test
    void getMaxProfitCase1() {
        MaxProfitMultipleTransactions maxProfitObj = new MaxProfitMultipleTransactions();
        int[] prices = {7,1,5,3,6,4};
        assertEquals(7, maxProfitObj.getMaxProfit(prices));
    }

    @Test
    void getMaxProfitCase2() {
        MaxProfitMultipleTransactions maxProfitObj = new MaxProfitMultipleTransactions();
        int[] prices = {1,2,3,4,5};
        assertEquals(4, maxProfitObj.getMaxProfit(prices));
    }
}