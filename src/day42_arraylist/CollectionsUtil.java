package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsUtil {
    public static void main(String[] args) {
       List<Integer> nums= new ArrayList<>(Arrays.asList(2,4,4,1,5,6,0,6));
          List<Character> letters= new ArrayList<>();
          letters.addAll(Arrays.asList('j', 'a', 'v', 'i'));//to add chars in the list
        System.out.println("size = "+letters.size());
        Collections.reverse(letters);
        System.out.println("letters reversed = "+letters);
        System.out.println("how many times does a appear in = " + Collections.frequency(letters, 'a'));
        System.out.println("max = " + Collections.max(nums));
        System.out.println("min = " + Collections.min(nums));
        Collections.shuffle(nums);
        System.out.println("after shuffle = "+nums);
    }
}
