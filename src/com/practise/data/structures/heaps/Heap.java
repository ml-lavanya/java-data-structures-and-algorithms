package com.practise.data.structures.heaps;

/**
 * We are going to implement max heap here, that means parent should be greater than the children
 */
public class Heap {
    int[] heap;
    int size = 0;

    public Heap(int capacity) {
        heap = new int[capacity];
    }

    public boolean isHeapFull(){
        return size == heap.length;
    }

    public void sort(){
        int lastHeapIndex = size - 1;
        for (int i = 0; i < lastHeapIndex; i++) {
            // swap parent with the last element
            int temp = heap[0];
            heap[0] = heap[lastHeapIndex];
            heap[lastHeapIndex] = heap[0];
            // heapify the new parent element so that correct parent (next highest number will become the parent)
            fixHeapBelow(0, lastHeapIndex - i -1);
        }
    }

    public void insert(int val) throws Exception{
        if (isHeapFull()){
            throw new Exception("Heap is full already");
        }
        heap[size] = val;
        // new element is in the position size - 1 now as the size was incremented above.
        // heapify for max heap
        fixHeapAbove(size, val);
        size++;
    }

    public int delete(int index) throws Exception{
        int deletedValue = heap[index];
        heap[index] = heap[size - 1];
        int parent = getParent(index);
        if(index == 0 || heap[index] < heap[parent]){
            fixHeapBelow(index, size - 1);
        }
        else{
            fixHeapAbove(index, heap[index]);
        }
        size--;
        return deletedValue;
    }

    public void fixHeapBelow(int index, int lastHeapIndex) {
//        int currentVal = heap[index];
        int childToSwap;
        while (index <= lastHeapIndex) {
            int leftChild = getChild(index, true);
            int rightChild = getChild(index, false);
            if (leftChild <= lastHeapIndex) {
                if (rightChild > lastHeapIndex)
                    childToSwap = leftChild;
                else {
                    childToSwap = heap[leftChild] > heap[rightChild] ? leftChild : rightChild;
                }
                if (heap[index] < heap[childToSwap]) {
                    int temp = heap[index];
                    heap[index] = heap[childToSwap];
                    heap[childToSwap] = temp;
                }
                else {
                    break;
                }
                index = childToSwap;
            }
            else {
                break;
            }
        }
    }
    public void fixHeapAbove(int index, int val){
        while (index > 0 && val > heap[getParent(index)]){
            heap[index] = heap[getParent(index)];
            index = getParent(index);
        }
        heap[index] = val;
    }

    public int getParent(int index){
        return (index - 1) /2;
    }

    public int getChild(int index, boolean isLeft){
        return isLeft ? 2*index+1 : 2*index+2;
    }

    public void printHeap(){
        int height =  (int) Math.ceil(Math.log(size+1) / Math.log(2));
        System.out.println("\nheight" + height);
        int currentElement = 0;
        for (int j=0; j < height; j++) {
            for (int i = 0; i < (2 * Math.pow(2, (height - 1 -j))) - 1; i++) {
                System.out.print(" ");
            }
            for (int i = 0; i < Math.pow(2, j) && currentElement < heap.length; i++) {
                System.out.print(heap[currentElement]);
                for (int k = 0; k < (2 * Math.pow(2, (height - j))) - 1; k++) {
                    System.out.print(" ");
                }
                currentElement ++;
            }
            System.out.println();
        }
    }
}
