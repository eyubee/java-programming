package replit;
import java.util.*;

public class FirstWordTwice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
      int wordLength=word.length ();
        if (wordLength <= 5){
            System.out.println(""+word.charAt(0)+word.charAt(1)+word.charAt(0)+word.charAt(1));}
        else if (wordLength > 5){
                System.out.println(""+word.charAt(0)+word.charAt(1)+word.charAt(2)+word.charAt(3)+word.charAt(0)+word.charAt(1)+word.charAt(2)+word.charAt(3));
        }
    }
}
