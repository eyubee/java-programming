package day40_arralist;
import java.util.*;

public class ArrayListLoop {
    public static void main(String[] args) {
        List <Integer> nums= new ArrayList<>();//common way of naming arratlist Polymorephic way of declaring
        nums.add(34); nums.add(20); nums.add(200); nums.add(300);
        nums.add(44);
        System.out.println("nums = "+nums);
        System.out.println(nums.remove(0));
        nums.remove(new Integer(20));//removes object not index
        System.out.println("new nums = " + nums);
        /**For loop interate through all values abd print*/
        for (int i= 0; i< nums.size(); i++){
            System.out.println(nums.get(i));
        }
/**for each loop and printing all the numbers on the same line*/
for (int each: nums){
    System.out.print(each+" ");
}


    }
}
