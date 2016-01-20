package practise;

import java.util.LinkedList;

/**
 * Created by Rohith on 05-11-2015.
 */
public class StackDemo {

    public static void main(String[] args) {
        LinkedList<String> stack = new LinkedList<>();
        stack.push("1");
        stack.push("2");
        stack.push("3");

        while(stack.peek() != null)
            System.out.println(stack.pop());
    }
}
