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
        visit(node.getData());
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }

    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.getLeft());
        visit(node.getData());
        inOrder(node.getRight());
    }

    public void afterOrder(Node node) {
        if (node == null) {
            return;
        }
        afterOrder(node.getLeft());
        afterOrder(node.getRight());
        visit(node.getData());
    }
}
