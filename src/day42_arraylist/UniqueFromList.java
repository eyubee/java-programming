package day42_arraylist;

import java.util.*;

public class UniqueFromList {
    public static void main(String[] args) {
        List<Integer> nums= new ArrayList<>(Arrays.asList(1, 2,3, 3, 4, 6, 6, 9));
        //loop through the list and return if the number is unique
        for (int num: nums){
            if(Collections.frequency(nums,num)==1){
                System.out.print( num+" ");

            }
        }


    }
}
