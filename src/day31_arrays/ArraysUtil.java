package day31_arrays;
import java.util.Arrays;

public class ArraysUtil {
    public static void main(String[] args) {
int [] nums= {100, 5,1,7,0,-4,44, 33};
        System.out.println(Arrays.toString(nums));

        //sort nums
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("min value: "+nums[0]);
        System.out.println("max value: "+nums[nums.length-1]);
    }
}
