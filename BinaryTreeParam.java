public class BinaryTreeParam<T extends Comparable<T>> {
    private BinaryNode<T> root;

    public BinaryTreeParam(T value) {
        root = new BinaryNode<T>(value);
    }

    public BinaryTreeParam() {
    }

    public boolean contains(T value) {
        if (root == null)
            return false;
        return root.contains(value);
    }

    public void insert(T value) {
        if (root == null) {
            root = new BinaryNode<T>(value);
        } else {
            root.insert(value);
        }
    }

    public void inorder() {
        if (root == null)
            return;
        root.inorder();
    }

    private static class BinaryNode<ET extends Comparable<ET>> {
        private BinaryNode<ET> leftSon, rightSon;
        private ET value;

        public BinaryNode(ET value) {
            this.value = value;
        }

        public boolean contains(ET v) {
            int difference = v.compareTo(value);
            if (difference == 0)
                return true;
            if (difference < 0) {
                if (leftSon == null)
                    return false;
                return leftSon.contains(v);
            } else {
                if (rightSon == null)
                    return false;
                return rightSon.contains(v);
            }
        }

        public void insert(ET v) {
            int difference = v.compareTo(value);
            if (difference == 0)
                return; // Knoten schon im Baum
            if (difference < 0) {
                if (leftSon == null) {
                    leftSon = new BinaryNode<ET>(v);
                } else {
                    leftSon.insert(v);
                }
            } else {
                if (rightSon == null) {
                    rightSon = new BinaryNode<ET>(v);
                } else {
                    rightSon.insert(v);
                }
            }
        }

        public void inorder() {
            if (leftSon != null) {
                leftSon.inorder();
            }
            System.out.println(value);
            if (rightSon != null) {
                rightSon.inorder();
            }
        }
    }
}