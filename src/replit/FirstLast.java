package replit;
import java.util.Scanner;
public class FirstLast {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        //String word = scan.next();
        //WRITE YOUR CODE HERE
        //String firstLetter=""+ word.charAt(0);
        //String lastLetter= ""+word.charAt(word.length()-1);
        //System.out.println(firstLetter+lastLetter);
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        String firstLetter=""+ word.charAt(0);
        String lastLetter= ""+word.charAt(word.length()-1);
        System.out.print(firstLetter+lastLetter);

    }
}