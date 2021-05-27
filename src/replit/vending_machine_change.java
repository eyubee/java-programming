package replit;
import java.util.Scanner;
public class vending_machine_change {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents:");
        int centsAmount =scan.nextInt();
        int quarters= centsAmount/25;//4*25
        int dimes= centsAmount/10; //10*10
        int nickels= centsAmount/20;//5*20
        int pennies= centsAmount/100;//1*100
        int productPrice= scan.nextInt();
        int changeAmount= centsAmount-productPrice;


        if ((centsAmount >0 )|| (centsAmount <100)){
            System.out.println("your chage is "+quarters+" quarters, "+ dimes+" dimes, " +nickels+" nickels, and "+pennies+" pennies");}
        else{
            System.out.println("Invalid cents amount");
        }
    }
}
