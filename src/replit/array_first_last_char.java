package replit;
import java.util.*;

public class array_first_last_char {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

//String beforeArray[]= Arrays.copyOf(words,words.length);
        //TODO: Write your code below
       int count =0;

String beforeArray[]= new String [words.length];
        for (String firstLast: words){

            beforeArray[count]=firstLast.charAt(0)+""+firstLast.charAt(firstLast.length()-1);
            count++;
            //beforeArray=firstLast.split(",")
        }
        System.out.println(Arrays.toString(beforeArray));
        String concat= "bdabsdb";
        System.out.println(concat+"hfffffh");




    }
}
