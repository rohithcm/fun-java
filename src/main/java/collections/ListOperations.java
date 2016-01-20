package collections;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.ListUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Rohith on 30-10-2015.
 */
public class ListOperations {

    static <T> void findCommonElement(List<T> smallList, HashSet<T> hashSet) {
        for (T str : smallList)
            if (hashSet.contains(str)) {
                System.out.println(str);
                hashSet.remove(str);
            }
    }

    static <T> void findCommonElement(List<T> smallList, List<T> bigList) {
        for (T str : smallList)
            if (bigList.contains(str)) {
                System.out.println(str);
                bigList.remove(str);
            }
    }

    static <T> void retainAllList(List<T> list1, List<T> list2) {
        list1.retainAll(list2);
        list1.forEach(System.out::println);
    }

    static <T extends Comparable<T>> void getMinMaxFromList(List<T> list) {
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
    }

    static <T> void clearListTest(List<T> list) {
        List<T> newList = new ArrayList<T>(list);
        List<T> newList2 = list;
        list.clear();
        System.out.println(newList.size());
        System.out.println(newList2.size());
    }

    static <T> void utilIntersection(List<T> list1, List<T> list2) {
        list1 = ListUtils.intersection(list1, list2);
        list1.forEach(System.out::println);
    }

    static <T> void toArrayTest(List<T> list) {
        String[] strArray = new String[list.size()];
        strArray = list.toArray(strArray);
    }

    public static void main(String[] args) {
        List<String> str1 = new ArrayList<>();
        List<String> str2 = new ArrayList<>();
        str1.add("a");
        str1.add("a");
        str1.add("b");
        str1.add("c");
        str1.add("e");
        str2.add("aa");
        str2.add("bb");
        str2.add("c");
        str2.add("d");
        str2.add("a");
        str2.add("a");

       /* if(str1.size() <= str2.size())
            findCommonElement(str1, str2);
        else
            findCommonElement(str2, str1);*/


        // System.out.println(Collections.max(str1));
        //retainAllList(str1,str2);
        //clearListTest(str1);
        utilIntersection(str1, str2);
    }


}
