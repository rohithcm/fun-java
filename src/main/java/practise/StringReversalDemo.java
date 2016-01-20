package practise;

/**
 * Created by Rohith on 31-10-2015.
 */
public class StringReversalDemo {
    static void reverseString(String str) {
        // new StringBuffer(str).reverse();
        char[] ch = new char[str.length()];
        for(int count = 1; count<=str.length(); count++)
            ch[count-1] = str.charAt(str.length()-count);
        System.out.println(new String(ch));
    }

    public static void main(String[] args) {
        reverseString("Rohith");
    }
}
