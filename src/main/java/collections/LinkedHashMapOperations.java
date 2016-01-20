package collections;

import java.util.LinkedHashMap;

/**
 * Created by Rohith on 30-10-2015.
 */
public class LinkedHashMapOperations {
    public static void main(String[] args) {
        LinkedHashMap<String,String> obj = new LinkedHashMap<>();
        obj.put("a","1");
        obj.put("c","3");
        obj.put("b","2");
        for(String str: obj.values())
            System.out.println(str);
    }
}
