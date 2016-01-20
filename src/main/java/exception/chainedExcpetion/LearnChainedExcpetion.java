package exception.chainedExcpetion;

import exception.learnthrows.MyException;
import exception.learnthrows.MyRuntimeException;

/**
 * Created by Rohith on 26-10-2015.
 */
public class LearnChainedExcpetion {

    static void testMethod3() throws MyException {
        throw new MyException(new MyRuntimeException("Chained Exception")); // requires throws
    }
    static void testMethod4() throws MyException {
        MyException e = new MyException("My Exception");
        e.initCause(new MyRuntimeException("Runtime e"));
        throw e; // requires throws
    }
    public static void main(String[] args) {
        try {
            testMethod3();
        }catch (MyException e){System.out.println(e);}
        finally {

        }
    }
}
