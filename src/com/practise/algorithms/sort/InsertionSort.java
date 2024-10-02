package com.practise.algorithms.sort;

public class InsertionSort {
    public void sort(int[] inputArray){
        for (int unsortedPartitionIndex = 1;
             unsortedPartitionIndex < inputArray.length;
             unsortedPartitionIndex ++) {
                int currentElement = inputArray[unsortedPartitionIndex];
                int i;
                for (i = unsortedPartitionIndex - 1; (i >= 0 && inputArray[i] > currentElement); i--) {
                    inputArray[i+1] = inputArray[i];
                }
                inputArray[i+1] = currentElement;
        }
    }
    public static void main(String[] args) {
        int[] arr = {90, 65, -10, 76, -50, 100, 0, -90};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);
        System.out.println("************ sorted array ************");
        for (int element : arr) {
            System.out.println(element);
        }
    }
}
