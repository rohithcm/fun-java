package collections;

import java.util.*;

/**
 * Created by Rohith on 30-10-2015.
 */

public class LinkedListOperations {

    static <T> void peekTest(LinkedList<T> list) {
        System.out.println(list.peek());
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
        list.forEach(System.out::println);
    }

    static <T> void pollTest(LinkedList<T> list) {
        System.out.println(list.poll());
        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("e");
//        peekTest(list1);
        pollTest(list1);
    }
}
