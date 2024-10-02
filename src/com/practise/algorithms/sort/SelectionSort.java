package com.practise.algorithms.sort;

public class SelectionSort {
    public void sort(int[] inputArray){
        for (int unsortedPartitionIndex = inputArray.length - 1;
             unsortedPartitionIndex > 0; unsortedPartitionIndex --) {
            int largestIndex = 0;
            for (int i = 1; i <= unsortedPartitionIndex; i ++) {
                if(inputArray[ i ] > inputArray[ largestIndex ]) largestIndex = i;
            }
            swap(inputArray, largestIndex, unsortedPartitionIndex);
        }
    }

    public void swap(int[] arr, int i, int j){
        if(i == j) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, -7, 20, -8, 35, -16, 78, -9, 79, 0};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(arr);
        System.out.println("************ sorted array ************");
        for (int element : arr) {
            System.out.println(element);
        }
    }
}