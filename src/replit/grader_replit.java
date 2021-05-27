package replit;
import java.util.*;
public class grader_replit {
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        System.out.println("Welcome to the Grader!");
        String Math = scan.next();
        String Biology =scan.next();
        String English = scan.next();
        String Chemistry= scan.next();
        String Music = scan.next();
        double mathScore= scan.nextDouble();
        double biologuScore= scan.nextDouble();
        double englishScore = scan.nextDouble();
        double chemistryScore =scan.nextDouble();
        double musinScore =scan.nextDouble();
        double averageScore= (mathScore+biologuScore+englishScore+chemistryScore+musinScore)/5;

        System.out.println("Please enter subject name number 1 and score for this subject \n"+Math);
        System.out.println(mathScore);
        System.out.println("Please enter subject name number 2 and score for this subject\n"+Biology);
        System.out.println(biologuScore);
        System.out.println("Please enter subject name number 3 and score for this subject\n"+English);
        System.out.println(englishScore);
        System.out.println("Please enter subject name number 4 and score for this subject\n"+Chemistry);
        System.out.println(chemistryScore);
        System.out.println("Please enter subject name number 5 and score for this subject\n"+Music);
        System.out.println(musinScore);
        System.out.println("Summary: "+Math+" - "+mathScore+", "+Biology+" - "+biologuScore+", "+English+" - "+englishScore+", "+", "+Chemistry+" - "+chemistryScore+", "+Music+" - "+mathScore);
        System.out.println("Your average score is: "+averageScore+"\nThak you for using Grader! \nGoodbye!");


    }
}
