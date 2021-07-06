package day59_polymorephism_exceptions.exception_handling;

public class SwallowingException {
    public static void main(String[] args) {
        try {
            System.out.println("hello");
            System.out.println(10/0);
        }catch ( Exception ignore){

        }
        System.out.println("we just suppressed/ swallowed the runtime exception");
        System.out.println("error is nor reported, we just ignore it");
    }
}
