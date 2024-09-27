package com.practise.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {
    QuickSort quickSort = new QuickSort();
    @Test
    void testSortForPositiveAndNegativeNumbers() {
        int[] arr = {90, 65, -10, 76, -50, 100, 0, -90};
        int[] expectedArray = {-90, -50, -10, 0, 65, 76, 90, 100};
        quickSort.sort(arr, 0, arr.length);
        assertArrayEquals(expectedArray, arr);
    }

    @Test
    void testSortForPositiveNumbers() {
        int[] arr1 = {90, 10, 20, 30, 40};
        int[] expectedArr1 = {10, 20, 30, 40, 90};
        quickSort.sort(arr1, 0, arr1.length);
        assertArrayEquals(expectedArr1, arr1);
    }

    @Test
    void testSortForNegativeNumbers() {
        int[] arr1 = {-90, -10, -20, -30, -40};
        int[] expectedArr1 = {-90, -40, -30, -20, -10};
        quickSort.sort(arr1, 0, arr1.length);
        assertArrayEquals(expectedArr1, arr1);
    }
}