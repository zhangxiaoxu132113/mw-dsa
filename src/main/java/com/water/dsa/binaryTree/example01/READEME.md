### 二叉树
*1 二叉树的定义
二叉树是每个节点最多有两个子树的树结构。它有五种基本形态：二叉树可以是空集；根可以有空的左子树或右子树；或者左、右子树皆为空。

*2 二叉树的性质
二叉树有以下几个性质：TODO(上标和下标)
性质1：二叉树第i层上的结点数目最多为 2{i-1} (i≥1)。
性质2：深度为k的二叉树至多有2{k}-1个结点(k≥1)。
性质3：包含n个结点的二叉树的高度至少为log2 (n+1)。
性质4：在任意一棵二叉树中，若终端结点的个数为n0，度为2的结点数为n2，则n0=n2+1。



2.1 性质1：二叉树第i层上的结点数目最多为 2{i-1} (i≥1)

证明：下面用"数学归纳法"进行证明。
        (01) 当i=1时，第i层的节点数目为2{i-1}=2{0}=1。因为第1层上只有一个根结点，所以命题成立。
        (02) 假设当i>1，第i层的节点数目为2{i-1}。这个是根据(01)推断出来的！
               下面根据这个假设，推断出"第(i+1)层的节点数目为2{i}"即可。
                由于二叉树的每个结点至多有两个孩子，故"第(i+1)层上的结点数目" 最多是 "第i层的结点数目的2倍"。即，第(i+1)层上的结点数目最大值=2×2{i-1}=2{i}。
                故假设成立，原命题得证！



2.2 性质2：深度为k的二叉树至多有2{k}-1个结点(k≥1)

证明：在具有相同深度的二叉树中，当每一层都含有最大结点数时，其树中结点数最多。利用"性质1"可知，深度为k的二叉树的结点数至多为：
           20+21+…+2k-1=2k-1
           故原命题得证！



2.3 性质3：包含n个结点的二叉树的高度至少为log2 (n+1)

证明：根据"性质2"可知，高度为h的二叉树最多有2{h}–1个结点。反之，对于包含n个节点的二叉树的高度至少为log2(n+1)。



2.4 性质4：在任意一棵二叉树中，若终端结点的个数为n0，度为2的结点数为n2，则n0=n2+1

证明：因为二叉树中所有结点的度数均不大于2，所以结点总数(记为n)="0度结点数(n0)" + "1度结点数(n1)" + "2度结点数(n2)"。由此，得到等式一。
         (等式一) n=n0+n1+n2
　     另一方面，0度结点没有孩子，1度结点有一个孩子，2度结点有两个孩子，故二叉树中孩子结点总数是：n1+2n2。此外，只有根不是任何结点的孩子。故二叉树中的结点总数又可表示为等式二。
         (等式二) n=n1+2n2+1
        由(等式一)和(等式二)计算得到：n0=n2+1。原命题得证！
#### 二叉树算法

```java
public class Node {
    private int data;
    private Node left;
    private Node right;

    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
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