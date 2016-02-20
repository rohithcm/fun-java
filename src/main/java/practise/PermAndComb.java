package practise;

/**
 * Created by Rohith on 07-02-2016.
 */
public class PermAndComb {
    public static void combination(String s) {
        combinationHelper(new String(""),new String(s),s.length());
    }
    private static void combinationHelper(String prefix, String s, int length){
        if(prefix.length() == length) {
            System.out.println(prefix);
            return;
        }
        for(int i=0;i<s.length();i++) {
            combinationHelper(prefix + s.charAt(i),
                    s.substring(0, i) + s.substring(i + 1), length);
        }
    }
    public static void permutation(String s) {
        permutationHelper(new String(""), new String(s), s.length());
    }
    private static void permutationHelper(String prefix, String s, int length){
        System.out.println(prefix);
        if(prefix.length() == length) {

            return;
        }
        for(int i=0;i<s.length();i++) {
            permutationHelper(prefix + s.charAt(i),
                    s.substring(0, i) + s.substring(i + 1), length);
        }
    }
    public static void main(String[] args){
        permutation("abc");
    }
}
