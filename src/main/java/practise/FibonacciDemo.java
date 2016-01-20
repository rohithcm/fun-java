package practise;

/**
 * Created by Rohith on 31-10-2015.
 */
public class FibonacciDemo {
    static void fibnoacciRec(int num1, int num2) {
        if (num1 <= 100) {
            System.out.print(num1 + " ");
            if (num1 == 0)
                num2 = 1;
            int temp = num1;
            num1 = num2;
            num2 = num1 + temp;
            fibnoacciRec(num1, num2);
        }
    }

    static void fibnoacci() {
        int num1 = 0, num2 = 1, count = 10;
        System.out.println(num1 + " ");
        for (int i = 1; i <= count; i++) {
            System.out.println(num2 + " ");
            num2 = num1 + num2;
            num1 = num2 - num1;
        }
    }

    public static void main(String[] args) {
        //fibnoacciRec(0, 0);
        fibnoacci();
    }
}
