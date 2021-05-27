package day09_scanner_practice;
import java.util.Scanner;
public class GroceryShopping {
    public static void main (String[]args){
        //Flow enter price for milk 3.99 eater price for bread: 2.55 enter price for cucumbers: 4.10 Total is $
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price for milk: ");
         double milk =scan.nextDouble();
        System.out.println("Enter price for bread: ");
         double bread =scan.nextDouble();
        System.out.println("Enter price for cucumber: ");
         double cucumber =scan.nextDouble();
         double totalPrice =milk+bread+cucumber;
        System.out.println("Mike "+milk);
        System.out.println("bread "+bread);
        System.out.println("cucumber "+cucumber);
        System.out.println("Total price: "+totalPrice);


    }
}
