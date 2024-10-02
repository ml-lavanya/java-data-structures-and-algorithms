package com.practise.algorithms.sort;

import java.util.Arrays;

public class MergeSortDescendingOrder {
    public void sort(int[] arr, int start, int end){
        // base case
        if(end - start < 2){
            return;
        }
        // splitting
        int mid = (start + end) / 2;
        sort(arr, start, mid);
        sort(arr, mid, end );
        merge(arr, start, mid, end);
        // merging
    }

    private void merge(int[] arr, int start, int mid, int end) {
        if(arr[mid - 1] >= arr[mid]){
            return;
        }
        int[] tempArray = new int[end - start];
        int i = start;
        int j= mid;
        int tempIndex = 0;
        while (i < mid && j < end){
            tempArray[tempIndex++] = arr[i] >= arr[j] ? arr[i++]: arr[j++];
        }
        System.arraycopy( arr, i, tempArray, tempIndex, (mid - i));
        System.arraycopy( tempArray, 0, arr, start, tempIndex + mid - i);
    }

    public static void main(String[] args) {
        MergeSortDescendingOrder mergeSort = new MergeSortDescendingOrder();
        int[] arr = {10, -7, 20, -8, 35, -16, 78, -9, 79, 0};
        mergeSort.sort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
