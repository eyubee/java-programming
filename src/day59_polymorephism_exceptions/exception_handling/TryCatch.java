package day59_polymorephism_exceptions.exception_handling;

public class TryCatch {
    public static void main(String[] args) {
        try {
            System.out.println(10/2);
            System.out.println(10/0);
            System.out.println(10/3);
        } catch (Exception e){
            System.out.println("runtime exception happened and handled");
        }
        System.out.println("after first try catch");
int [] nums= {11, 33, 44};
try{
    System.out.println(nums[0]);
    System.out.println(nums[3]);
} catch (ArrayIndexOutOfBoundsException e){
    System.out.println("there is no index 3 in the above array so ArrayIndexOutOfBoundsException occurred");
}


    }
}
