package collections;

import java.util.*;

/**
 * Created by Rohith on 30-10-2015.
 */
public class CollectionTestClass {
    static boolean isPalindrome(String str) {
        StringBuffer strBuf = new StringBuffer(str).reverse();
        return strBuf.toString().equals(str);
    }

    public static void main(String[] args) {
        String str = "dabbad";
        LinkedHashMap<String, String> lhs = new LinkedHashMap<>();
        for (int count = str.length(); count > 0; count--) {
            String s = str.substring(0, count);
            if (isPalindrome(s)) {
                System.out.println(s);
                break;
            }
        }
    }

}
