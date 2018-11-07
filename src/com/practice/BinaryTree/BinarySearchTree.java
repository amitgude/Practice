package com.practice.BinaryTree;

public class BinarySearchTree {



    public Node insert(Node root, int data){

        if(root == null)
            root = new Node(data);

        else if(data > root.getData())
            root.setRight(insert(root.getRight(),data));

        else
            root.setLeft(insert(root.getLeft(),data));

        return root;
    }

    public Boolean isDataPresent(Node root, int data){
        if(root == null)
        return false;

        if(root.getData() == data)
            return true;

        if(root.getData() < data)
            return isDataPresent(root.getRight(),data);

        if(root.getData() > data)
            return isDataPresent(root.getLeft(),data);

        return false;
    }


    public void findMin(Node root){
        Node current = root;
        while(current.getLeft() != null)
            current = current.getLeft();
        System.out.println("Min value :: "+ current.getData());
    }

    public void findMax(Node root){
        Node current = root;
        while(current.getRight() != null)
            current = current.getRight();
        System.out.println("Max value :: "+ current.getData());
    }

    public int findHeight(Node root){
        if(root == null)
            return 0;

        return Math.max(findHeight(root.getLeft()),findHeight(root.getRight())) +1;


    }

    int maxDepth(Node node)
    {
        if (node == null)
            return 0;
        else
        {
            /* compute the depth of each subtree */
            int lDepth = maxDepth(node.getLeft());
            int rDepth = maxDepth(node.getRight());

            /* use the larger one */
            if (lDepth > rDepth)
                return (lDepth + 1);
            else
                return (rDepth + 1);
        }
    }
}
