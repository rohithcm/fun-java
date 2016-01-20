package enumeration;

/**
 * Created by Rohith on 26-10-2015.
 */

enum Apple {
    ABC(10), CDE(20);
    int price;

    public int getPrice() {
        return price;
    }

    Apple(int price) {
        this.price = price;
    }
}

public class LearnEnum {
    public static void main(String[] args) {
        System.out.println(Apple.ABC.getPrice());
        System.out.println(Apple.ABC.ordinal());
        System.out.println(Apple.ABC.compareTo(Apple.CDE));
    }
}
