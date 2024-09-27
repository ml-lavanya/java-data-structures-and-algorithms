package com.practise.algorithms;

public class QuickSort {
    public int getPivotIndex(int[] inputArray, int start, int end){
        // Assume starting number as the Pivot
        int pivot = inputArray[start];
        int i = start;
        int j = end;
        while (i<j){
            // Empty loop to find the j value from right side where value is less than pivot
            while (i<j && inputArray[--j] >= pivot);
            if(i<j){
                inputArray[i] = inputArray[j];
            }
            // Empty loop to find the i value from left side where value is greater than pivot
            while (i<j && inputArray[++i] <= pivot);
            if(i<j){
                inputArray[j] = inputArray[i];
            }
        }
        inputArray[i] = pivot;
        return i;
    }
    public void sort(int[] inputArray, int start, int end){
        if(end - start < 2){
            return;
        }
        int pivotIndex = getPivotIndex(inputArray, start, end);
        sort(inputArray, start, pivotIndex);
        sort(inputArray, pivotIndex + 1, end);
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] arr = {10, -7, 20, -8, 35, -16, 78, -9, 79, 0};
        quickSort.sort(arr, 0, arr.length);
        for (int ele: arr){
            System.out.println(ele);
        }
    }
}
