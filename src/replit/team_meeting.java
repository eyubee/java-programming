package replit;

import java.util.Scanner;

//In Cybertek we have three batch types: US morning, US evening, EU.
//Depending on a batch type (String) print information about the batch.
//Use Scanner to retrieve required variables.
//First figure out is is a US batch or EU batch
//
//    - for US batches:
//
//Figure out is it a morning batch or evening batch
//morning - print: Class times are 10-5 EST. M, T, Th, F.
//evening - print: Class times are 7-10 EST. M, T, W, Th and 10-5 EST. S, S.
//
//    - for EU batches:
//
//print: Class times are  10-5 EST. M, T, W, Th, F.
//=========================================================================
//
//
//There are 5 errors, could be: java code, logic, typo, etc.
import java.util.Scanner;
public class team_meeting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter location: US or EU");
        String batch = scan.next();
        if (batch.equals("US") || batch.equals("us")) {
            System.out.println("Enter Time: Day or Evening");
            String time = scan.next();
            if ((time.equals("Day")) || (time.equals("day"))) {
                System.out.println("Class times are 10-5 EST. M, T, Th, F.");
            } else if (time.equals("Evening") || time.equals("evening")) {
                System.out.println("Class times are 7-10 EST. M, T, W, Th, S, S");
            } else {
                System.out.println("Invalid Entry");
            }
        } else if (batch.equals("EU") || batch.equals("eu")) {
            System.out.println("Class times are  10-5 EST. M, T, W, Th, F.");
        } else {
            System.out.println("Invalid Batch type");
        }

    }
}
