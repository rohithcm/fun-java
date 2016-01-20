package practise.bst;

/**
 * Created by Rohith on 05-11-2015.
 */
class BST<T extends Comparable<T>> {
    Node<T> root;

    void insert(final T value) {
        Node<T> node = new Node(value);

        if (root == null) {
            root = node;
            return;
        }
        insertRec(root, node);

    }

    private void insertRec(Node<T> node, Node<T> newNode) {
        if (node.value.compareTo(newNode.value) > 0) {
            if (node.left == null) {
                node.left = newNode;
                return;
            } else
                insertRec(node.left, newNode);
        } else {
            if (node.right == null) {
                node.right = newNode;
                return;
            } else
                insertRec(node.right, newNode);
        }

    }

    void displayPreOrder() {
        if (root == null) {
            System.out.println("Empty tree");
            return;
        }
        displayPreOrderRec(root);
    }

    private void displayPreOrderRec(Node<T> node) {
        if (node == null)
            return;
        System.out.print(node.value + " ");
        displayPreOrderRec(node.left);
        displayPreOrderRec(node.right);
    }

    void displayInorder() {
        if (root == null) {
            System.out.println("Empty tree");
            return;
        }
        displayInorderRec(root);
    }

    private void displayInorderRec(Node<T> node) {
        if (node == null)
            return;
        displayInorderRec(node.left);
        System.out.println(node.value + " ");
        displayInorderRec(node.right);
    }

    void displayPostOrder() {
        if (root == null) {
            System.out.println("Empty tree");
            return;
        }
        displayPostOrderRec(root);
    }

    private void displayPostOrderRec(Node<T> node) {
        if (node == null)
            return;
        displayPostOrderRec(node.left);
        displayPostOrderRec(node.right);
        System.out.println(node.value + " ");
    }

    T findMin() {
        if (root == null) {
            System.out.println("Empty tree");
            return null;
        }
        return findMinRec(root);
    }
    private T findMinRec(Node<T> node) {
        if(node.left == null)
            return node.value;
        return findMinRec(node.left);
    }
    T findMax() {
        if (root == null) {
            System.out.println("Empty tree");
            return null;
        }
        return findMaxRec(root);
    }
    private T findMaxRec(Node<T> node) {
        if(node.right == null)
            return node.value;
        return findMaxRec(node.right);
    }

    void remove(final T value) {
        if (root == null) {
            System.out.println("Empty tree");
            return;
        }
        if(root.value.equals(value)) {
            Node<T> tempRoot = new Node<T>(null);
            tempRoot.left = root;
            root.remove(tempRoot,value);
            root = tempRoot.left;
        } else
            root.remove(null,value);
    }
}
