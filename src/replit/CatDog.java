package replit;
import java.util.*;

public class CatDog {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();
        int charCount= word.length();
        int maxChar= 3;
        for (int i=0;i<= charCount-maxChar; i++ ){
           // System.out.println(word.substring(i,i+maxChar));
            String targetWord= word.substring(i,i+maxChar);
            if(targetWord.equals("cat")){
                countOfCats++;
            }else if (targetWord.equals("dog")){
                countOfDogs++;}


        }
        System.out.println((countOfCats==countOfDogs));
    }
}
