package day24_loops;

public class Aphabet {
    public static void main(String[] args) {
        char letter= 'a';
        while (letter <='z' ){
            System.out.print(" " + letter);
            letter++;
        }
        System.out.println();
        char letter2= 'z';
        while (letter2 >='a' ){
            System.out.print(" " + letter2);
            letter2--;}
    }
}
