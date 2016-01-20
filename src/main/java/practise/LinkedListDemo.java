package practise;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Rohith on 31-10-2015.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> obj = new LinkedList<>();
        obj.add("one");
        obj.add("two");
        obj.add("three");
        obj.add("four");
        obj.add("five");
        Iterator<String> it = obj.iterator();
        Iterator<String> it2 = obj.descendingIterator();
        double count = 0;
        while(it2.hasNext()) {
            it2.next();
            String elem = it.next();
            if(it2.hasNext())
                it2.next();

            if(!it2.hasNext()){
                System.out.println(elem);
                break;
            }

        }

    }
}
