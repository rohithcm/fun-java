package practise;

/**
 * Created by Rohith on 31-10-2015.
 */
public class PrimeNumberDemo {

    static void checkPrime(int num) {
        boolean flag = true;
        for(int count=2; count<num/2; count++)
            if(num % count == 0) {
                flag = false;
                break;
            }
        if(flag)
            System.out.println("prime");
        else
            System.out.println("not prime");
    }
    public static void main(String[] args) {
        checkPrime(11);
    }
}
