package replit;
import java.util.Scanner;

public class countingLetters {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str){
        int count=0;
        String result="";
        for(int i=0; i<str.length()-1; i++){
            for(int j=0; j< str.length()-1; j++)
                if(str.charAt(i) == str.charAt(j)){
                    count++;
        }
            if(!result.contains(""+str.charAt(i))){
                result += count+""+str.charAt(i);
            }
                }

        return result;

    }


}

