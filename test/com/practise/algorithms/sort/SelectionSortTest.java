package com.practise.algorithms.sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    SelectionSort selectionSort = new SelectionSort();

    @Test
    void testSortForPositiveAndNegativeNumbers() {
        int[] arr = {90, 65, -10, 76, -50, 100, 0, -90};
        int[] expectedArray = {-90, -50, -10, 0, 65, 76, 90, 100};
        selectionSort.sort(arr);
        assertArrayEquals(expectedArray, arr);
    }

    @Test
    void testSortForPositiveNumbers() {
        int[] arr1 = {90, 10, 20, 30, 40};
        int[] expectedArr1 = {10, 20, 30, 40, 90};
        selectionSort.sort(arr1);
        assertArrayEquals(expectedArr1, arr1);
    }

    @Test
    void testSortForNegativeNumbers() {
        int[] arr1 = {-90, -10, -20, -30, -40};
        int[] expectedArr1 = {-90, -40, -30, -20, -10};
        selectionSort.sort(arr1);
        assertArrayEquals(expectedArr1, arr1);
    }
}