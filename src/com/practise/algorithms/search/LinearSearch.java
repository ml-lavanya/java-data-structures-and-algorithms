package com.practise.algorithms.search;

public class LinearSearch {

    private int search(int i, int[] input) {
        for (int j = 0; j < input.length; j++) {
            if(input[j] == i){
                return j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
    int[] list = {22, 90, -4, 67, 87, 2000, 0, 10, 56, 98};
    LinearSearch linearSearch = new LinearSearch();
        System.out.println(linearSearch.search(22, list));
        System.out.println(linearSearch.search(88, list));
        System.out.println(linearSearch.search(0, list));
        System.out.println(linearSearch.search(2000, list));
        System.out.println(linearSearch.search(100, list));
    }
}
