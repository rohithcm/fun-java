package threads.priority;

/**
 * Created by Rohith on 26-10-2015.
 */
public class LearnPriority {

    static class DiffPriority implements Runnable {
        private Thread t;
        protected volatile boolean running = true;
        private int p;
        public long count=0;

        DiffPriority(int p) {
            t = new Thread(this);
            t.setPriority(p);
        }
        public void run() {
            while(running) {
                count++;
            }
        }
        public void start() {
            t.start();
        }
        public void stop() {
            running = false;
        }
    }
    public static void main(String[] args) {
        DiffPriority t1 = new DiffPriority(Thread.NORM_PRIORITY + 2);
        DiffPriority t2 = new DiffPriority(Thread.NORM_PRIORITY - 2);
        t1.start();t2.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.stop();t2.stop();

        try {
            t1.t.join();
            t2.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread 1 : "+t1.count);
        System.out.println("Thread 2 : "+t2.count);
    }
}
