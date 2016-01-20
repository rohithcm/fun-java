package practise;

/**
 * Created by Rohith on 31-10-2015.
 */
// Armstrong is sum of cube of individual number is number itself
public class ArmstrongDemo {

    static void checkArmstrong(final int num) {
        int temp = num;
        int sum=0;
        while(temp != 0) {
            int indNum = temp % 10;
            temp /= 10;
            sum+=Math.pow(indNum,3);
        }
        if(sum == num)
            System.out.println("Is Armstrong");
        else
            System.out.println("Nope");
    }
    public static void main(String[] args) {
        checkArmstrong(2);
    }
}
