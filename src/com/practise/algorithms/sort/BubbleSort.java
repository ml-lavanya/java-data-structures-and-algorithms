package com.practise.algorithms.sort;

public class BubbleSort {
    public void sort(int[] inputArray){
        for (int unsortedPartitionIndex = inputArray.length - 1;
             unsortedPartitionIndex > 0; unsortedPartitionIndex --) {
            for (int i = 0; i < unsortedPartitionIndex; i ++) {
                if(inputArray[ i ] > inputArray[ i + 1 ]) swap(inputArray, i, i + 1);
            }
        }
    }

    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {10, -7, 20, -8, 35, -16, 78, -9, 79, 0};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);
        System.out.println("************ sorted array ************");
        for (int element : arr) {
            System.out.println(element);
        }
    }
}
