package com.practice.BinaryTree;

public class Node {

    private int data;
    private Node right;
    private Node left;

    public Node(int data) {
        this.data = data;
        this.right = null;
        this.left = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }
}
