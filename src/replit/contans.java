package replit;
import java.util.Scanner;

public class contans {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String sentence = scan.nextLine();
        //WRITE YOUR CODE HERE
        if (sentence.contains(word)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        System.out.println("Enter full name:");
        String fullName= scan.nextLine();
        if ((fullName.equalsIgnoreCase("Max Payne"))|| (fullName.equalsIgnoreCase("Alan Wake")) ) {
            System.out.println("User found!");
        }else {
            System.out.println("User not found!");
        }
    }
}
