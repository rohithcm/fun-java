package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * Created by Rohith on 30-10-2015.
 */
public class IteratorOperations {
    public static void main(String[] args) {
        ArrayList<String> obj = new ArrayList<>();
        obj.add("a");
        obj.add("b");
        obj.add("c");

        Iterator<String> it = obj.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        ListIterator<String> listit = obj.listIterator();
        while(listit.hasNext()) {
            String elem = listit.next();
            listit.set(elem+" appended");
        }
        while(listit.hasPrevious())
            System.out.println(listit.previous());
    }
}
