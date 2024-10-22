package com.practise.data.structures.heaps;

public class Main {
    public static void main(String[] args) throws Exception {
        int capacity = 15;
        Heap heap = new Heap(capacity);
        heap.insert(25);
        heap.insert(22);
        heap.insert(23);
        heap.insert(19);
        heap.insert(20);
        heap.insert(17);
        heap.insert(15);
        heap.insert(24);
        heap.insert(16);
        heap.insert(28);
        heap.insert(1);
        heap.insert(2);
        heap.insert(3);
        heap.insert(4);

        System.out.println("heap length is" + heap.heap.length);

        System.out.println(heap.delete(4)) ;
        heap.printHeap();
    }
}
