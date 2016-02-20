package practise;

import java.util.ArrayList;

/**
 * Created by Rohith on 07-02-2016.
 */
public class RemoveDups {
    private static String removeDuplicates(String s) {
        StringBuilder sb=new StringBuilder(s);
        int i=0;
        int len = sb.length();

        while(i < s.length()-1) {
            char c = s.charAt(i);
            if(s.substring(i+1).contains(c+""))
                s=s.replaceAll(c+"","");
            else
                i++;
        }
        return s;
    }
    public static void main(String[] args) {
        System.out.println(removeDuplicates("cutcopypaste"));
    }
}
