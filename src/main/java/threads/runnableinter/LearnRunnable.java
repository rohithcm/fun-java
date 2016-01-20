package threads.runnableinter;

/**
 * Created by Rohith on 26-10-2015.
 */

public class LearnRunnable {
    static class NewThread implements Runnable {

        Thread t;

        public NewThread() {
            t = new Thread(this,"Thread 2");
            t.start();
        }
        @Override
        public void run() {
            for(int count = 0; count <5; count++)
                try {
                    t.sleep(500);
                    System.out.println("Thread 2 : "+count);
                } catch (InterruptedException e) {

                }
            System.out.println("Thread 2 ended");
        }
    }
    public static void main(String[] args) {
        new NewThread();
        for(int count = 0; count <5; count++)
            try {
                Thread.sleep(1000);
                System.out.println("Main Thread : "+count);
            } catch (InterruptedException e) {

            }
        System.out.println("Main thread ended");
    }
}
