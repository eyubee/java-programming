package day25_loops;
import java.util.*;
public class withoutX {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int lastChar= word.length()-1;

        if (word.substring(0,1).equalsIgnoreCase("X")) {//first only
            word=word.substring(1);
            System.out.println(word);
        }else if (word.substring (word.length()-1).equalsIgnoreCase("x"))//last only
        {word= word.substring(0,word.length()-1);
            System.out.println(word);
        }else {
            System.out.println(word);
        }



    }
}
