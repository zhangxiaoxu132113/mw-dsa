package com.water.dsa.binaryTree.example02;

import com.water.dsa.binaryTree.example01.Node;

/**
 * Created by mrwater on 2017/8/24.
 */
public class BinaryTreeHelper {

    /**
     * 二叉树插入
     * 比节点值大的作为右节点，比节点值小的作为左节点
     */
    public static void insertWithBalance(Node node, int data) {
        if (node == null) return;
        if (data > node.getData()) {
            if (node.getRight() == null) {
                node.setRight(new Node(data));
            } else {
                insertWithBalance(node.getRight(), data);
            }
        } else {
            if (node.getLeft() == null) {
                node.setLeft(new Node(data));
            } else {
                insertWithBalance(node.getLeft(), data);
            }
        }
    }

    /**
     * 求二叉树的最大深度
     * @param node
     * @return
     */
    public static int maxDeath(Node node) {
        if (node == null) {
            return 0;
        }
        int left = maxDeath(node.getLeft());
        int right = maxDeath(node.getRight());
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        int[] intArr = {12,23,54,1,232,92};
        Node node = new Node(intArr[0]);
        for (int i=1; i<intArr.length;i++) {
            insertWithBalance(node, intArr[i]);
        }
        System.out.println("二叉树的最大深度 : " + maxDeath(node));
    }
}
