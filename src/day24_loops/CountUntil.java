package day24_loops;
import java.util.*;
public class CountUntil {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
        int count =1;
        while (count<=number){
            System.out.println("start counting "+count);
            count++;
        }
        System.out.println("done counting");
    }
}
