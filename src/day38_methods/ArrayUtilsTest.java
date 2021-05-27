package day38_methods;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int [] nums={3,5,0};
        int num=0;
        ArraysUtils.PrintArray(nums);
        System.out.println("sum = "+ArraysUtils.sum(nums));

        System.out.println("contains = "+  ArraysUtils.contains(nums,10));



    }
}
