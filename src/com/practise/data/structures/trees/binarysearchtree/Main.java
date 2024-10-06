package com.practise.data.structures.trees.binarysearchtree;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(50);
        tree.insert(35);
        tree.insert(25);
        tree.insert(45);
        tree.insert(30);
        tree.insert(50);
        tree.insert(350);
        tree.traverseInorder();

        System.out.println(tree.get(45));
    }
}
