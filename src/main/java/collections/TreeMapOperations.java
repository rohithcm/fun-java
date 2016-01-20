package collections;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * Created by Rohith on 30-10-2015.
 */

class Tcomp implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        String[] str1 = o1.split(" +"), str2 = o2.split(" +");

        return str1[str1.length-1].compareTo(str2[str2.length-1]);
    }
}
public class TreeMapOperations {
    public static void main(String[] args) {
        TreeMap<String,Integer> treeMap = new TreeMap<>(new Tcomp());
        treeMap.put("John Doe",1);
        treeMap.put("Tom Smith",1);
        treeMap.put("Jane Baker",1);
        treeMap.put("Tod Hall",1);
        System.out.println(treeMap);
        for(String key : treeMap.keySet())
            System.out.println(key+" "+treeMap.get(key));
    }
}
