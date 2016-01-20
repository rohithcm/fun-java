package practise.cci;

/**
 * Created by Rohith on 13-11-2015.
 */
public class BitManipulation {

    static int clearMSBthroughI(int num,int i) {
        int mask = ~0 >> i;
        return num >> i;
        //return mask;
    }

    static int clearMSBthroughI2(int num, int i) {
        int mask = (1<< i) - 1;
        return num & mask;
        //return mask;
    }
    public static void main(String[] args) {
        System.out.println(clearMSBthroughI(50, 4));
        System.out.println(clearMSBthroughI2(50, 4));
    }
}
