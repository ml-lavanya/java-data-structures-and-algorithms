package com.practise.algorithms.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void testSortForPositiveAndNegativeNumbers() {
        BubbleSort bubbleSort = new BubbleSort();

        int[] arr = {90, 65, -10, 76, -50, 100, 0, -90};
        int[] expectedArray = {-90, -50, -10, 0, 65, 76, 90, 100};
        bubbleSort.sort(arr);
        assertArrayEquals(expectedArray, arr);
    }

    @Test
    void testSortForPositiveNumbers() {
        BubbleSort bubbleSort = new BubbleSort();

        int[] arr1 = {90, 10, 20, 30, 40};
        int[] expectedArr1 = {10, 20, 30, 40, 90};
        bubbleSort.sort(arr1);
        assertArrayEquals(expectedArr1, arr1);
    }

    @Test
    void testSortForNegativeNumbers() {
        BubbleSort bubbleSort = new BubbleSort();

        int[] arr1 = {-90, -10, -20, -30, -40};
        int[] expectedArr1 = {-90, -40, -30, -20, -10};
        bubbleSort.sort(arr1);
        assertArrayEquals(expectedArr1, arr1);
    }
}