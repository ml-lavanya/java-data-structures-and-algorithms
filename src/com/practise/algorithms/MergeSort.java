package com.practise.algorithms;

public class MergeSort {
    public void merge(int[] input, int start, int mid, int end){
        if(input[mid -1] < input[mid]){
            return;
        }
        int[] temp = new int[end - start];
        int tempIndex = 0;
        int i = start;
        int j= mid;
        while (i < mid && j < end){
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }
        // This also works
//        System.arraycopy( input, i, input, start + tempIndex, (mid - i));
//        System.arraycopy( temp, 0, input, start, tempIndex);

        System.arraycopy( input, i, temp, tempIndex, (mid - i));
        System.arraycopy( temp, 0, input, start, tempIndex + mid - i);
    }

    public void sort(int[] input, int start, int end){
        if(end - start < 2){
            return;
        }
        int mid = (start + end) / 2;
        sort(input, start, mid);
        sort(input, mid, end);
        merge(input, start, mid, end);
    }
    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        int[] arr = {10, -7, 20, -8, 35, -16, 78, -9, 79, 0};
        mergeSort.sort(arr, 0, arr.length);
        for (int ele: arr){
            System.out.println(ele);
        }
    }
}
