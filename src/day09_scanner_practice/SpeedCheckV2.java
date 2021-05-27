package day09_scanner_practice;
import java.util.Scanner;

public class SpeedCheckV2 {
    public static void main( String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sppeds");
        int currentSpeed =scan.nextInt();
        int speedLimit= 50;
        int overTheLimit=currentSpeed-speedLimit;
        System.out.println("you are driving "+overTheLimit+" mps over the limit. ");

    }
}
