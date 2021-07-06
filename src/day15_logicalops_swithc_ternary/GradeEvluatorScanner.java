package day15_logicalops_swithc_ternary;
import java.util.Scanner;
public class GradeEvluatorScanner {
    public static void main(String[] args) {
        //grade= a, b, c,d , e
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter grade here");
        char grade = scan.next().charAt(0);
        if (grade == 'A') {
            System.out.println("passsed with grade " + grade);
        } else if (grade == 'B') {
            System.out.println("passsed with grade " + grade);
        } else if (grade == 'C') {
            System.out.println("passsed with grade " + grade);
        } else if (grade == 'D') {
            System.out.println("qualify for retake when grade is  " + grade);
        } else {
            System.out.println("invalid grade");
        }
        //OR
        if (grade == 'A' || grade == 'B' || grade == 'C') {
            System.out.println("passsed with grade " + grade);
        } else if (grade == 'D') {
            System.out.println("qualify for retake when grade is  " + grade);
        } else {
            System.out.println("invalid grade");
        }
    }
}
