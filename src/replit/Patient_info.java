package replit;
import java.util.Scanner;
public class Patient_info {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents:");
        int quarters= scan.nextInt();
        int dimes = scan.nextInt();
        int nickels = scan.nextInt();
        int pennies = scan.nextInt();
        int value = scan.nextInt();
        if ((value >0 )|| (value <100)){
            System.out.println("your chage is "+quarters+"quarters, "+dimes+" dimes, " +nickels+" nickels, and "+pennies+" pennies");}
        else{
            System.out.println("Invalid cents amount");
        }

    }
}