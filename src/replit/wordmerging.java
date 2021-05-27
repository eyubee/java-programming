package replit;
import java.util.Scanner;

public class wordmerging {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        int  word1Check=  word1.length();
        int   word2Check= word1.length();
        String wordmerg= ""+word1.charAt(0)+word2.charAt(0)+word1.charAt(1)+word2.charAt(1)+word1.charAt(2)+word2.charAt(2);
        if ((word1Check <=3) && (word2Check<=3)){
            System.out.print(wordmerg);
        } else if ((word1Check>3) && (word1Check>3)) {
            System.out.print("cannot merge");}


    }
}
