### 二叉树
* 二叉树的定义
二叉树是每个节点最多有两个子树的树结构。它有五种基本形态：二叉树可以是空集；根可以有空的左子树或右子树；或者左、右子树皆为空。

* 二叉树的性质
1，树的最大度为2
2，分左右子树

#### 二叉树算法

```java
public class Node {
    private int data;
    private Node left;
    private Node right;

    public Node(int data) {
        this.data = data;
    }
    ... setting getting ...
}

```

```java
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

```

![image](https://github.com/zhangxiaoxu132113/mw-dsa/blob/master/src/main/resources/img/erchashu_bianli.png)