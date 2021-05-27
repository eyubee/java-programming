package day10_shorthand_operator;
import java.util.Scanner;
public class NextLineBug {
    public static void main(String []args){
        Scanner scan =new Scanner(System.in);
        System.out.println("enter price here");
        double rent=scan.nextDouble();
        scan.nextLine();//work around for the issue
        String month=scan.nextLine();
        System.out.println("rent = "+rent);
        System.out.println("month =" +month);
        double hour =scan.nextDouble();
        double minute =scan.nextDouble();
        double second =scan.nextDouble();
        scan.nextLine();
        String amOrPm =scan.next();

        System.out.println(hour+":"+minute+":"+second+" "+amOrPm);


    }
}
