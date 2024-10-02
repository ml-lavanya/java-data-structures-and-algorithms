package com.practise.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public void sort(int[] input){
         List<Integer>[] buckets = new List[10];
        // put elements into different buckets based on hash
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < input.length; i++) {
            buckets[input[i] / 10].add(input[i]);
        }
        // sort each bucket
        for(List bucket: buckets){
            Collections.sort(bucket);
        }
        // merge all buckets into input array
        int j=0;
        for (int i = 0; i < buckets.length; i++) {
            for (int value: buckets[i]){
                input[j++] = value;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {10, 7, 20, 8, 35, 16, 78, 9, 79, 0};
        BucketSort bucketSort = new BucketSort();
        bucketSort.sort(arr);
        System.out.println("************ Bucket sort: sorted array ************");
        for (int element : arr) {
            System.out.println(element);
        }
    }
}
