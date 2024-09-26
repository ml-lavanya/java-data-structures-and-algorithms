package com.practise.data.structures.Arrays;

import java.util.Arrays;

/*
 An array is a container object that holds a fixed number of values of a single type.
 The length of an array is established when the array is created. After creation, its length
 is fixed.
 */
public class BasicOperations {
    public static void main(String[] args) {

        /* Array declaration - first way */
        int[] arr = {-10, 50, -120, 2, 14};

        /* Print array elements */
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("i[%1$d] = %2$d %n", i, arr[i]);
        }

        /* Arrays sort */
        System.out.println("\n********* Arrays.sort example ***********");
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("i[%1$d] = %2$d %n", i, arr[i]);
        }

        /* Array declaration - second way */
        int[] newArr = new int[5];
        newArr[0] = -10;
        newArr[1] = 50;
        newArr[2] = -120;
        newArr[3] = 2;
        newArr[4] = 14;

        /* Arrays parallel sort */
        System.out.println("\n********* Arrays parallel sort example ***********");
        Arrays.parallelSort(arr);
        for (int i = 0; i < newArr.length; i++) {
            System.out.printf("i[%1$d] = %2$d %n", i, newArr[i]);
        }

        System.out.println("\n*********** Arrays.binarySearch example ************");
        int searchKey = 50;
        System.out.printf("%1$d is in position %2$d %n", searchKey, Arrays.binarySearch(arr, searchKey));

        System.out.println("\n*********** Arrays.copyOf example ************");
        int[] arr2 = Arrays.copyOf(arr, 5);
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("i[%1$d] = %2$d %n", i, arr2[i]);
        }

        System.out.println("\n*********** Arrays.copyOf example ************");
        int[] arr3 = Arrays.copyOfRange(arr, 0, 4);
        for (int i = 0; i < arr3.length; i++) {
            System.out.printf("i[%1$d] = %2$d %n", i, arr3[i]);
        }

        System.out.println("\n*********** Arrays.mismatch example ************");
        System.out.println(Arrays.mismatch(arr2, arr3)); // arr2 and arr3 has mismatch at index 4
        System.out.println(Arrays.mismatch(arr, arr2)); // arr, arr2 are same so mismatch returns -1
    }
}
