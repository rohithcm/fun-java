package threads;

/**
 * Created by Rohith on 26-10-2015.
 */
public class LearnMainThread {

    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread : "+t);
        t.setName("My Thread");
        System.out.println("After alteration : "+t);
    }
}
