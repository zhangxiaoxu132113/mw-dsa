package com.water.dsa.binaryTree.example01;

/**
 * Created by mrwater on 2017/8/24.
 */
public class FindTree {

    public void visit(int data) {
        System.out.println(" --- " + data);
    }

    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }

    public void inOrder(Node node) {

    }

    public void afterOrder(Node node) {

    }
}
