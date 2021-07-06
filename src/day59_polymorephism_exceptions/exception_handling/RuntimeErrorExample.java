package day59_polymorephism_exceptions.exception_handling;

public class RuntimeErrorExample {
    public static void main(String[] args) {
        System.out.println(10/2);
        /** run time exception happens. code compiles fine and during execution code throws exception
         * ArithmeticException */
        System.out.println(10/0);
        System.out.println(10/3);
    }
}
