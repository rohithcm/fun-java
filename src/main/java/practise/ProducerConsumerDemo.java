package practise;

/**
 * Created by Rohith on 31-10-2015.
 */
class ProducerConsumer {
    boolean flag;
    int num = 0;
    synchronized void produce() {
        if(flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        num ++;
        System.out.println(num);
        flag = true;
        notify();
    }
    synchronized void consume() {
        if(!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        num--;
        System.out.println(num);
        flag = false;
        notify();
    }
}
class ThreadClass implements Runnable {
    ProducerConsumer obj;
    Thread t;
    ThreadClass(ProducerConsumer obj) {
        t = new Thread(this);
        this.obj = obj;
        t.start();

    }

    @Override
    public void run() {
        for(int count=0; count<5;count++) {
            obj.produce();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            obj.consume();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
public class ProducerConsumerDemo {
    public static void main(String[] args) {
        ProducerConsumer p = new ProducerConsumer();
        ThreadClass tc = new ThreadClass(p);
        ThreadClass tc2 = new ThreadClass(p);

        try {
            tc.t.join();
            tc2 .t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
