package replit;
import java.util.Scanner;
public class PrintingStars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //WRITE YOUR CODE HERE
        for (int outer = 0; outer <=n; outer++) {
                System.out.print("*");
       }


    }
}