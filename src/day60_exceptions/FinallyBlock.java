package day60_exceptions;
import java.util.*;

public class FinallyBlock {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        try{
        System.out.println("Enter a number");
        int num= scan.nextInt();//if we put String we get  InputMismatchException
        System.out.println(" you entered "+ num);
       // System.exit(0);//stop java all together and finally block  will not run
        } catch (InputMismatchException e){
            System.out.println("you entered invalid value ");
        }finally {
            scan.close();//close and clean up scanner
            System.out.println("Finally block- runs always");
        }

    }
}
