package practise.bst;

/**
 * Created by Rohith on 05-11-2015.
 */
class Node<T extends Comparable<T>> {
    T value;
    Node<T> left;
    Node<T> right;

    Node(final T value) {
        this.value = value;
    }

    Node(final T value, final Node<T> left, final Node<T> right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    boolean remove(Node<T> parent, T valueToRemove) {
        if(value.compareTo(valueToRemove) < 0)
            return (right != null) ? right.remove(this,valueToRemove): false;
        else if(value.compareTo(valueToRemove) > 0)
            return (left != null) ? left.remove(this,valueToRemove): false;
        else {
            if (left != null && right != null) {
                value = right.getMinValue();
                right.remove(this, value);
            } else if(parent.left == this)
                parent.left = (left != null) ? left : right;
            else if(parent.right== this)
                parent.right = (right != null) ? right : right;
            return true;

        }
    }
    T getMinValue() {
        if(left == null)
            return value;
        return left.getMinValue();
    }

}
