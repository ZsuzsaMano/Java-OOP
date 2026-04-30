public class BinaryTree {
    private BinaryNode root;

    public BinaryTree(int value) {
        this.root = new BinaryNode(value);
    }

    public BinaryTree() {
    }

    boolean contains(BinaryNode node, int value) {

        if (node == null) {
            return false;
        }
        if (node.value == value) {
            return true;
        }
        if (value > node.value) {
            return contains(node.rightSon, value);

        }
        if (value < node.value) {
            return contains(node.leftSon, value);
        }
        return false;

    }

    public void insert(int value) {
        if ((contains(root, value))) {
            return;
        }
        if (root == null) {
            root = new BinaryNode(value);
            return;
        }
        BinaryNode previousNode = null;
        BinaryNode node = root;

        while (node != null) {
            previousNode = node;
            if (value < node.value) {
                node = node.leftSon;
            } else if (value > node.value) {
                node = node.rightSon;
            }
        }
        BinaryNode newNode = new BinaryNode(value);
        if (value < previousNode.value) {
            previousNode.leftSon = newNode;

        } else {
            previousNode.rightSon = newNode;

        }

    }

    public void inorder() {
        BinaryNode node = root;
        BinaryNode previousNode = null;

        while (node.leftSon != null) {
            previousNode = node;
            node = node.leftSon;
        }
        System.out.println(node.value); // most left value

    }

    private static class BinaryNode {
        private BinaryNode leftSon, rightSon;

        private int value;

        public BinaryNode(int value) {
            this.value = value;
        }
    }
}
