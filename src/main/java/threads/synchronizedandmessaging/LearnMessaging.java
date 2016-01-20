package threads.synchronizedandmessaging;

/**
 * Created by Rohith on 26-10-2015.
 */
public class LearnMessaging {
    static class Q {
        int n;
        boolean valueSet=false;
        synchronized int getN() {
            if(!valueSet) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("get : "+n);
            valueSet = false;
            notify();
            return n;
        }
        synchronized void putN(final int n) {
            if(valueSet)  {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            this.n = n;
            valueSet = true;
            notify();
        }
    }

}
