package exception.learnthrow;

/**
 * Created by Rohith on 26-10-2015.
 */
public class Learnthrow {

    static void throwingMethod() {
        try {
            throw new NullPointerException("Custom message");
        } catch (
                NullPointerException e
                ) {
            throw e;
        }
    }
    public static void main(String[] args) {
        try {
            throwingMethod();
        }catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
