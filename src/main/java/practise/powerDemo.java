package practise;

/**
 * Created by Rohith on 31-10-2015.
 */
public class powerDemo {

    static int calcPower(long a, int b) {
        if(b == 1)
            return a;
        else {
            int c = a * a;
            int answ = calcPower(c,b/2);
            if(b % 2 != 0)
                return answ * a;
            return answ;
        }

    }

    public static void main(String[] args) {
        System.out.println(calcPower(2,5));
    }
}
