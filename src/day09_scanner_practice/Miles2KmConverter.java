package day09_scanner_practice;
import java.util.Scanner;

public class Miles2KmConverter {
    public static void main(String[] args) {
        //enter miles: 10 what is 10 miles in kilometers 1 km =1.609mil
        Scanner scan = new Scanner(System.in);
        System.out.println("enter miles");
        double miles = scan.nextDouble();
        double kilometer= miles*1.609;
        System.out.println(miles+" miles in kilometers: "+kilometer);
    }
}
