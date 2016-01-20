package threads.threadclass;

/**
 * Created by Rohith on 26-10-2015.
 */
class NewThread extends Thread {
    NewThread() {
        super("Thread 2");
        start();
    }
    public void run() {
        for(int count = 0; count <5; count++)
            try {
                Thread.sleep(500);
                System.out.println("Thread 2 : "+count);
            } catch (InterruptedException e) {

            }
        System.out.println("Thread 2 ended");
    }
}

public class LearnThread {
    public static void main(String[] args) {
        NewThread newThread = new NewThread();
        for(int count = 0; count <5; count++)
            try {
                Thread.sleep(1000);
                System.out.println("Main Thread : "+count);
            } catch (InterruptedException e) {

            }
        try {
            newThread.join();  // wait till newthread ends

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread ended");
    }
}
