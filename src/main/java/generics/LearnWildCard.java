package generics;

/**
 * Created by Rohith on 27-10-2015.
 */
class Wild<T extends Number> {
 // same code as before

    //To determin if 2 averages are same
    /*boolean sameAvg(Wild<? extends Number> ob) {
        if(average() == ob.average())
            return true;
        return false;
    }*/
}

public class LearnWildCard {
}
