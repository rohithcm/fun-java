package practise.cci;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Rohith on 07-11-2015.
 */
public class StringManipulation {

    static boolean isUnique(String str) {
        boolean[] carray = new boolean[256];
        if (str == null || str.isEmpty())
            return false;
        for (char ch : str.toCharArray()) {
            if (carray[ch])
                return false;
            carray[ch] = true;
        }
        return true;
    }

    static boolean checkParenthesis(String str) {
        if(str == null || str.isEmpty())
            return false;
        int left = 0, right = 0;
        for(char ch : str.toCharArray()) {
            if(ch == '{')
                left++;
            else if (ch == '}')
                right++;
            if(right > left)
                return false;
        }
        if(right == left)
            return true;
        return false;
    }

    public static void main(String[] args) {
        //System.out.println(isUnique("abcd "));
        //System.out.println(checkParenthesis("}{}{}"));
        System.out.println(Integer.MAX_VALUE);
    }
}
