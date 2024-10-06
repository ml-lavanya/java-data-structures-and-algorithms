package com.practise.data.structures.trees.binarysearchtree;

public class Tree {
    private TreeNode root;

    public void insert(int nodeValue){
        System.out.print("node value:" + nodeValue );
        if(root == null){
            root = new TreeNode(nodeValue);
            System.out.println("\t root element");
        }
        else {
            root.insert(nodeValue);
        }
    }

    public void  traverseInorder(){
        if(root != null){
            root.traverseInOrder();
        }
        else{
            System.out.println("empty tree");
        }
    }

    public TreeNode get(int val){
        if(root != null){
            return root.get(val);
        }
        return null;
    }
}
