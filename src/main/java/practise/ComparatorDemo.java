package practise;

import org.apache.commons.collections4.CollectionUtils;

import java.util.*;

/**
 * Created by Rohith on 31-10-2015.
 */
class Employee{
    String name;
    String department;
    Integer age;
    Employee(String name,String department,int age){
        this.name = name;
        this.department = department;
        this.age = age;
    }
    public String toString() {
        return "["+name+","+department+","+age+"]";
    }
}
class Ecomp implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int val = 0;
        if(o1.name.equals(o2.name)) {
            if(o1.department.equals(o2.department)) {
                val = o1.age.compareTo(o2.age);
            } else
                val = o1.department.compareTo(o2.department);
        } else
            val = o1.name.compareTo(o2.name);
        return val;
    }
}
public class ComparatorDemo {
    public static void main(String[] args) {
        List<Employee> elist = new ArrayList<>();
        elist.add(new Employee("b","a",20));
        elist.add(new Employee("b","a",2));
        elist.add(new Employee("b","a",10));
        elist.add(new Employee("b","a",2));
        elist.add(new Employee("a","a",1));
        elist.add(new Employee("a","b",1));
        elist.add(new Employee("c","a",1));
        Collections.sort(elist,new Ecomp().reversed());
        /*Employee[] earray = new Employee[elist.size()];  // how to get array from list
        earray = elist.toArray(earray);*/

        System.out.println(elist);
    }
}
