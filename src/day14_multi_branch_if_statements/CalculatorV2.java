package day14_multi_branch_if_statements;
import java.util.Scanner;
public class CalculatorV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter 2 numbers here");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        char selection = scan.next().charAt(0);
        //operators 1,+,*,/% when operator +
        if (selection == '+') {
            System.out.println(num1 + num2);
        } else if (selection == '-') {
            System.out.println(num1 - num2);
        } else if (selection == '*') {
            System.out.println(num1 * num2);
        } else if (selection == '/') {
            System.out.println(num1 / num2);
        } else if (selection == '%') {
            System.out.println(num1 % num2);
        } else {
            System.out.println("invalid operator");
        }
        String snnbsandb= scan.next();
    }
}
