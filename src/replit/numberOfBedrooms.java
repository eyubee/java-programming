package replit;
import java.util.Scanner;

public class numberOfBedrooms {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Cybertek Apartments!");
        System.out.println("Number of bedrooms you are interested:");

        int numberOfBedrooms = scan.nextInt();
        int startingPrice = 0;

        //WRITE YOUR CODE HERE:

        if (numberOfBedrooms == 1) {
            startingPrice = 1100;
            System.out.println(numberOfBedrooms + "\nOne Bedroom Selected\nStarting Price: ");
        } else if (numberOfBedrooms == 2) {
            startingPrice = 1850;
            System.out.println(numberOfBedrooms + "\nTwo Bedroom Selected\nStarting Price: ");
        } else if (numberOfBedrooms == 3) {
            startingPrice = 2550;
            System.out.println(numberOfBedrooms + "\nThree Bedroom Selected\nStarting Price: ");
        } else {
            System.out.println(numberOfBedrooms + "No such Bedrooms available");
        }
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        if ((num1>num2&& num1<num3)||(num1>num2 && num1>num3)) {
            System.out.println("Enter first number:");
            System.out.println("Enter second number:");
            System.out.println("Enter third number:");
            System.out.println("Medium value is: " + num2);
        }else if ((num2>num1&& num2<num3)|| (num2>num1&& num1>num3)){
            System.out.println("Enter first number:");
            System.out.println("Enter second number:");
            System.out.println("Enter third number:");
            System.out.println("Medium value is: " + num1);
        }else if (num3< num1 && num2<num3){
            System.out.println("Enter first number:");
            System.out.println("Enter second number:");
            System.out.println("Enter third number:");
            System.out.println("Medium value is: " + num1);
        }
        }
}
