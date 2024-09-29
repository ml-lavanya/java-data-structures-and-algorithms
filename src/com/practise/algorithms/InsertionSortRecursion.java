package com.practise.algorithms;

import java.util.Arrays;

public class InsertionSortRecursion {
    public void sort(int[] inputArray, int numberOfItems){
        if(numberOfItems < 2)
        {
            return;
        }
        sort(inputArray, numberOfItems - 1);
        int currentElement = inputArray[numberOfItems - 1];
        int i;
        for (i = numberOfItems - 1; (i > 0 && inputArray[i - 1] > currentElement); i--) {
            inputArray[i] = inputArray[i-1];
        }
        inputArray[i] = currentElement;
        System.out.println("result of call when number of items:" + numberOfItems);
        System.out.println(Arrays.toString(inputArray));
    }
    public static void main(String[] args) {
        int[] arr = {90, 65, -10, 76, -50, 100, 0, -90};
        InsertionSortRecursion insertionSort = new InsertionSortRecursion();
        insertionSort.sort(arr, arr.length);
        System.out.println("************ sorted array ************");
        for (int element : arr) {
            System.out.println(element);
        }
    }
}
