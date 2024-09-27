package com.practise.algorithms;

import java.util.Arrays;

public class CountingSort {
    public void sort(int[] arr, int min, int max){
        // Assuming all data is between min and max , including max
        /* countArray[0] holds number of mins present in the main array. Let's say, min in our case
        * is 1, so countArray[0] holds the number of 1's present in the array.
        */
        int[] countArray = new int[(max - min) + 1];
        for (int ele : arr) {
            countArray[ele - min]++;
        }
        int j = 0;
        for (int i = min; i <= max ; i++) {
            while (countArray[i - min] > 0){
                arr[j++] = i;
                countArray[i - min]--;
            }
        }
    }

    public static void main(String[] args) {
        CountingSort countingSort = new CountingSort();
        int[] arrIn = {10, 7, 8, 8, 3, 6, 7, 1, 7, 5, 2, 1};
        countingSort.sort(arrIn, 1, 10);
        System.out.println(Arrays.toString(arrIn));
    }
}
