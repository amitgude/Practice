package com.practice.BinaryTree;

public class Main {



    public static void main(String[] args){

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        Node root = null;
        root = binarySearchTree.insert(root,10);
        root = binarySearchTree.insert(root,20);
        root = binarySearchTree.insert(root,5);


        binarySearchTree.findMin(root);
        binarySearchTree.findMax(root);
        System.out.println(binarySearchTree.findHeight(root));
        System.out.println(binarySearchTree.maxDepth(root));
        System.out.println(binarySearchTree.isDataPresent(root,30));
    }
}
