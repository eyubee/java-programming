package day31_arrays;
import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums={23,123,654, 2344, 12345, 14421};
        System.out.println(Arrays.binarySearch(nums,400));
        System.out.println(Arrays.binarySearch(nums,123));

    }
}
