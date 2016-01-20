package collections;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by Rohith on 30-10-2015.
 */
public class ArrayDequeOperations {
    public static void main(String[] args) {
        ArrayDeque<String> obj = new ArrayDeque<>();
        obj.push("a");
        obj.push("b");
        obj.push("c");

        while(obj.peek() != null)
            System.out.println(obj.pop());
    }
}
