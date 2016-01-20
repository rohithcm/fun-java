package exception.learnthrows;

/**
 * Created by Rohith on 26-10-2015.
 */
public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
    public MyException(RuntimeException e) {
        super(e);
    }
}
