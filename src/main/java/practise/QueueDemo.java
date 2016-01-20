package practise;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Rohith on 05-11-2015.
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");
        queue.offer("2");
        queue.offer("3");

        while (queue.peek() != null)
            System.out.println(queue.poll());
    }
}
