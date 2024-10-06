package com.practise.data.structures.trees.binarysearchtree;

public class TreeNode {
    private int data;

    @Override
    public String toString() {
        return "data=" + data +
                '}';
    }

    private TreeNode leftChild;
    private  TreeNode rightChild;

    public TreeNode(int data) {
        this.data = data;
    }

    public void insert(int nodeValue){
        if(nodeValue == data){
            System.out.printf("\t duplicate element node value: %1$d data: %2$d %n", nodeValue, data);
            return;
        } else if (nodeValue < data) {
            if (leftChild == null){
                System.out.println("\t left child");
                leftChild = new TreeNode(nodeValue);
            }
            else leftChild.insert(nodeValue);
        } else {
            if (rightChild == null){
                System.out.println("\t right child");
                rightChild = new TreeNode(nodeValue);
            }
            else rightChild.insert(nodeValue);
        }
    }

    public void traverseInOrder(){
        if(leftChild != null){
            leftChild.traverseInOrder();
        }
        System.out.print(data + ", ");
        if (rightChild != null){
            rightChild.traverseInOrder();
        }
    }
    public int getData() {
        return data;
    }

    public TreeNode get(int val){
        if(val == data){
            return this;
        }
        if(val < data && leftChild != null){
            return leftChild.get(val);
        } else if (rightChild != null) {
            return rightChild.get(val);
        }
        return null;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    public void setData(int data) {
        this.data = data;
    }
}
