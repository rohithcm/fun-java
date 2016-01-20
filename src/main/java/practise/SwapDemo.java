package practise;

/**
 * Created by Rohith on 31-10-2015.
 */
// swap number without 3rd var
public class SwapDemo {
    static void swap(int num1, int num2) {
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println(num1 + " " + num2);
    }

    public static void main(String[] args) {
        int a = 1;
        long b = a;
        int c = (int) b;
        swap(2, 3);
        int[][] ar = new int[4][];
    }

    protected static void sample() {
    }
}
