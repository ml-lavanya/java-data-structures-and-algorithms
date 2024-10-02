package com.practise.algorithms.search;

/**
 * Data must be in sorted for this search algorithm.
 */
public class BinarySearch {
    public int recursivesearch(int[] input, int value, int start, int end){
        if(start >= end){
            return -1;
        }
        int mid = (start + end)/2;
        if(input[mid] == value){
            return mid;
        }
        else if(value < input[mid]){
            end = mid;
            return recursivesearch(input, value, start, mid);
        } else {
            start = mid + 1;
            return recursivesearch(input, value, start, end);
        }
    }

    public int iterativeSearch(int[] input, int value){
        int start = 0;
        int end = input.length;

        while (start < end){
            int mid = (start + end) / 2;
            if(input[mid] == value){
                return mid;
            }
            else if(value < input[mid]){
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-10, 9, 34, 56, 78, 91, 101};
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.recursivesearch(arr, 9, 0, arr.length));
        System.out.println(binarySearch.recursivesearch(arr, 19, 0, arr.length));
        System.out.println(binarySearch.recursivesearch(arr, 34, 0, arr.length));
        System.out.println(binarySearch.recursivesearch(arr, 78, 0, arr.length));

        System.out.println(binarySearch.iterativeSearch(arr, 9));
        System.out.println(binarySearch.iterativeSearch(arr, 19));
        System.out.println(binarySearch.iterativeSearch(arr, 34));
        System.out.println(binarySearch.iterativeSearch(arr, 78));
    }
}
