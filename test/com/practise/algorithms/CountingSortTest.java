package com.practise.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingSortTest {
    CountingSort countingSort = new CountingSort();
    @Test
    void testSortForIndexOutOfBoundException() {
        int[] arr = {1, -19, 2, 3, 56};
        ArrayIndexOutOfBoundsException exception = assertThrows(
                ArrayIndexOutOfBoundsException.class,
                () -> countingSort.sort(arr, 1, 10));
    }

    @Test
    void testSortForPositiveNumbers() {
        int[] arr1 = {10, 7, 8, 8, 3, 6, 7, 1, 7, 5, 2, 1};
        int[] expectedArr1 = {1, 1, 2, 3, 5, 6, 7, 7, 7, 8, 8, 10};
        countingSort.sort(arr1, 1, 10);
        assertArrayEquals(expectedArr1, arr1);
    }

}