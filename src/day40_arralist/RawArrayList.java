package day40_arralist;
import java.util.*;

public class RawArrayList {
    public static void main(String[] args) {
        /**Declaring raw arraylist*/
        ArrayList list1= new ArrayList();//raw way of declrearing
        List list2= new ArrayList();
        list1.add("java");
        list1.add("love");
        list1.add("fun");
        list1.add(123);
        list1.add('b');
        System.out.println(list1);
    }
}
