public class BST<T extends Comparable<T>> {

    private BinaryNode<T> root;
    private int size;

    public void add(T[] data) {
        for(int i = 0; i < data.length; i++) {
            add(data[i]);
        }
    }

    public void add(T data) {
        if(isEmpty()) {
            root = new BinaryNode<T>(data);
        } else {
            add(root, data);
        }

        size++;
    }

    private void add(BinaryNode<T> node, T data) {
        if(data.compareTo(node.data) < 0) {
            if(node.left != null) {
                add(node.left, data);
            } else {
                node.left = new BinaryNode<T>(data);
                size++;

                return;
            }
        } else if(data.compareTo(node.data) > 0) {
            if(node.right != null) {
                add(node.right, data);
            } else {
                node.right = new BinaryNode<T>(data);
                size++;

                return;
            }
        } else {
            return;
        }
    }

    public boolean find(T data) {
        if(isEmpty()) {
            return false;
        } else {
            return find(root, data) == null ? false : true;
        }
    }

    private BinaryNode<T> find(BinaryNode<T> node, T data) {
        if(data.compareTo(node.data) < 0) {
            if(node.left != null) {
                return find(node.left, data);
            } else {
                return null;
            }
        } else if(data.compareTo(node.data) > 0) {
            if(node.right != null) {
                return find(node.right, data);
            } else {
                return null;
            }
        } else {
            return node;
        }
    }

    public int height() {
        return height(root);
    }

    private int height(BinaryNode<T> node) {
        if(node == null) {
            return -1;
        }
        return Integer.max(height(node.left), height(node.right)) + 1;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void print() {
        System.out.print("Binary Tree: ");
        if(isEmpty()) {
            System.out.print("Empty");
        } else {
            printInOrder(root);
        }
        System.out.print("\n");
    }

    private void printInOrder(BinaryNode<T> node) {
        if(node == null) {
            return;
        }

        printInOrder(node.left);
        System.out.printf("%3d ", node.data);
        printInOrder(node.right);
    }


    private class BinaryNode<G> {

        private G data;
        private BinaryNode<G> left;
        private BinaryNode<G> right;

        public BinaryNode(G data) {
            this.data = data;
        }

    }

}