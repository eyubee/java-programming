package replit;
import java.util.*;

public class java_true {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
       /** String word = scan.next();
        if (word.startsWith("java")||word.substring(1).startsWith("java")){

            System.out.println(!exists);
        }else  {
            System.out.println(exists);
        }*/
        int inhabitants = scan.nextInt();
        int day= 0;

        while ( inhabitants >0 ){
            System.out.println("Day "+day+ " ["+inhabitants+"]");
            inhabitants= inhabitants/2;
            day++;


        }
        if (inhabitants>=0) {
            System.out.println("---- EXTINCT ----");}


            }

        }




