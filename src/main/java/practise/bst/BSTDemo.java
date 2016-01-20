package practise.bst;

import java.util.Comparator;
import java.util.TreeSet;

public class BSTDemo {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        bst.insert(3);
        bst.insert(2);
        bst.insert(1);
        bst.insert(5);
        bst.insert(4);
        bst.insert(6);
        
        //bst.displayPreOrder();
        //bst.displayInorder();
        //bst.displayPostOrder();

        //System.out.println(bst.findMax());
        //System.out.println(bst.findMin());

        //bst.remove(5);
        //bst.displayInorder();
    }
}
