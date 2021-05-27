package day40_arralist;
import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<Integer> nums= new ArrayList<>();
        nums.add(5);
        nums.add(7);
        nums.add(20);
        System.out.println("nums size = " + nums.size());
        System.out.println("nums index 0 = " + nums.get(0));
        nums.remove(1);
        System.out.println("nums removed= " + nums);
    }
}
