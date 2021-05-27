package day24_loops;
import java.util.*;
public class GuessTheNumber {
    public static void main(String[] args) {
        Random randomNum = new Random();
        //System.out.println(randomNum.nextInt(101));
        Scanner scan = new Scanner(System.in);
        int secretNumber = randomNum.nextInt();
        int gussedNumber;
        int numberOfTry= 5;
        do {
            System.out.println("guess the secret number");
            gussedNumber = scan.nextInt();
            if ((gussedNumber != secretNumber) && (numberOfTry <= 5)) {
                System.out.println("wrong, your number is too large");
            } else if ((gussedNumber !=  secretNumber) && (numberOfTry<= 5)) {
                System.out.println("wrong, your number is too small");
            } else {
                System.out.println("try again later");
            }
        }while (gussedNumber != secretNumber) ;
        System.out.println("congrates, you won!! secret number is " + secretNumber);



    }
}
