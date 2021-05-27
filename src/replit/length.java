package replit;
import java.util.Scanner;

public class length {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        String firstLetter=""+ word.charAt(0);
        String lastLetter= ""+word.charAt(word.length()-1);
        System.out.println(firstLetter+lastLetter);

        int charCheck= word.length();
        int checkEvenOdd= word.length()%2;
        int reminder= checkEvenOdd;
        if ((checkEvenOdd==1) && (charCheck==3)){
            System.out.println(""+word.charAt(1));}
        else if ((checkEvenOdd==1) && (charCheck>=3)){
            System.out.println(""+word.charAt(2));
    }else if ((checkEvenOdd==1) && charCheck==1){
        System.out.println(""+word+word+word);
    }else if ((checkEvenOdd==0) && charCheck==4){
        System.out.println(""+word.charAt(1)+word.charAt(1));
    }else if ((checkEvenOdd==0) && charCheck>=4){
        System.out.println(""+word.charAt(1)+word.charAt(2));
    }else if ((checkEvenOdd==0) && charCheck==2){
        System.out.println(""+word+word);}


}
}
