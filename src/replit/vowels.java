package replit;
import java.util.Scanner;
public class vowels {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        //write your code below
        char vowlesLetters;
        for (int i=0; i<word.length();i++){
            vowlesLetters= word.charAt(i);
            if (vowlesLetters== 'a'|| vowlesLetters=='e' || vowlesLetters=='i' ||vowlesLetters=='o' || vowlesLetters=='u')  {

                System.out.print(vowlesLetters);

            }
word.substring(word.indexOf("0"));
        }

    }
}
