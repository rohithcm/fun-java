package exception.learnthrows;

/**
 * Created by Rohith on 26-10-2015.
 */
public class LearnThrows {

    static void testMethod() {
        throw new MyRuntimeException("runtime"); //will not throw be compile exceptions since NullPointerException is run time exception
    }
    static void testMethod2(){
        //throw new MyException("compiletime"); // requires throws
    }
    static void testMethod3() throws MyException {
        throw new MyException("compiletime"); // requires throws
    }
    public static void main(String[] args) {
        testMethod();
        //testMethod3(); // error beccause, should be caught
        try {
            testMethod3();
        }catch (MyException e){}
        finally {

        }
    }
}
