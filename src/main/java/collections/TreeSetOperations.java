package collections;

import java.util.TreeSet;

/**
 * Created by Rohith on 30-10-2015.
 */
public class TreeSetOperations {

    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet<>();
        tree.add("B");
        tree.add("D");
        tree.add("A");
        System.out.println(tree);
        System.out.println(tree.subSet("A","D"));
    }
}
