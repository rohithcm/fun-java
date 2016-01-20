package practise;

/**
 * Created by Rohith on 31-10-2015.
 */
public class FizzBuzzDemo {
    static void fizzbuzz(int num) {
        if(num <=50) {
            if(num%15 == 0)
                System.out.print("FizzBuzz,");
            else if(num%5 == 0)
                System.out.print("Buzz,");
            else if(num%3 == 0)
                System.out.print("Fizz,");
            else
                System.out.print(num + ",");
            fizzbuzz(++num);
        }
    }
    public static void main(String[] args) {
        fizzbuzz(1);
    }
}
