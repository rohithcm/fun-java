package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Created by Rohith on 30-10-2015.
 */
public class HashSetOperations {

    public static void main(String[] args) {
        HashSet<String> obj = new HashSet<>();
        obj.add("B");
        obj.add("A");
        obj.add("D");
        obj.forEach(System.out::println);
        LinkedHashSet<String> obj1 = new LinkedHashSet<>();
        obj1.add("B");
        obj1.add("A");
        obj1.add("D");
        obj1.forEach(System.out::println);
    }
}
