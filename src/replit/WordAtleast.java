package replit;
import java.util.*;

public class WordAtleast {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String firstWord= scan.next();
        String secondWord = scan.next();
        int firstlength =firstWord.length();
        int secondlength = secondWord.length();
        if  (firstlength <=6 &&secondlength<=6 ){
            System.out.println(firstWord.substring(0,4)+secondWord.substring(secondlength-3)+"@cybertek.com");
        }else {
           System.out.println ("Invalid data”");
        }
        }

    }

