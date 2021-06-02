package extra_work;
import java.util.Scanner;

public class loopsPractice2 {
    public static void main(String[] args) {
//        A word that is the same read forwards and backwards. User takes a word from the console. Print true if the word is a palindrome. Print false if the word is not palindrome.-> input: civic-> output: true-> input: java-> output: false
        String palindrome = "";
        Scanner scan = new Scanner(System.in);
        String currenWorld = scan.nextLine();
        for (int i = currenWorld.length()-1; i >= 0; i--) {
            palindrome += currenWorld.charAt(i);
        }
        if(palindrome.equals(currenWorld)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
//        System.out.println(palindrome);

//        Given a String, find and print how many uppercase letter,
//        lowercase letter, and number are in the String.Ex:Input: 2juMp41EEkd4s4Output:3 uppercase letters6 lowercase letters5numbers
        String givenWord= scan.nextLine();
       int upperCase=0;
        int lowerCase=0;
      int intCount=0;
      for(int i=0; i<givenWord.length(); i++){
          char eachLetter= givenWord.charAt(i);
          if(eachLetter>='A'&& eachLetter<='Z'){
              upperCase++;
      }else if(eachLetter>='a' && eachLetter<='z'){
              lowerCase++;
          }else if( eachLetter >='0' && eachLetter <='9' ){
              intCount++;
          }

      }
        System.out.println(upperCase);
        System.out.println(lowerCase);
        System.out.println(intCount);
//        Given a String find the biggest substring of chars that match and print it.Ex: aaabbbcccccddddeeOutput: ccccc
        String str = "aaabbbcccccddddee";
        String longestSubstring= "";
        String temp = "";
       for(int i=0; i< str.length()-1; i++) {temp += str.charAt(i);
           if(str.charAt(i) != str.charAt(i+ 1) || i== str.length()-2){
               if(i== str.length()-2 && str.charAt(i) == str.charAt(i+ 1)){
                   temp += str.charAt(i+1);}
               if(temp.length() > longestSubstring.length()) {
                   longestSubstring= temp;}
               temp = "";}
       }System.out.println("Longest substring: "+ longestSubstring);

    }
}