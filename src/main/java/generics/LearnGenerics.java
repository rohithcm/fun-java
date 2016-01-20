package generics;

/**
 * Created by Rohith on 27-10-2015.
 */
class Gen<T,V> {
    T ob;
    V ob2;
    public Gen(T ob,V ob2) {
        this.ob = ob;
        this.ob2 = ob2;
    }

    T getOb() {
        return ob;
    }

    public V getOb2() {
        return ob2;
    }

    void showType() {
        System.out.println("Type is " + ob.getClass().getName());
    }
}

class Average<T extends Number> {
    T[] nums;
    Average(T[] nums){
        this.nums = nums;
    }
    /*T getAverage() {
        
    }*/
}

public class LearnGenerics {
    Gen<Integer,String> ob = new Gen<Integer,String>(100,"Generics");
    Gen<Boolean,Double> s = new Gen<Boolean,Double>(false,40.1);

}
