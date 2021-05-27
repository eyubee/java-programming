package day10_shorthand_operator;
import java.util.Scanner;
public class WeatherToday {
    public static void main( String[]args){
        //weather--sunny,rainning,very cold, very hot
        Scanner scan = new Scanner(System.in);
        System.out.println("How is the weather today?");
        //String whether=scan.next();//accepts string only till the first space or one world only
        String weather =scan.nextLine();
        System.out.println("The weather today is "+weather);//prints everything no restricatiom
    }
}
