package day09_scanner_practice;
import java.util.Scanner;

public class AskAgeV2 {
    //flow main method print "how old are you?" age----system input scan.next();
    //print "age-that great age!"
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        //scan.nextInt();//we type the value iside the program and value will be asigned
        int age2 =scan.nextInt();
        int age=30;// age value is already indetfied and could only be 30
        System.out.println(age2+"- thats great age!");
        System.out.println(age+"- that's great age!");
        //scan.close(); optional to close scanner so you can stop the program from running and cleab up memory


        }

}
