package replit;
import java.util.*;

public class PrintingEachLatter {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        /*String word = inp.nextLine();
        //write your code below

        for (int i= 0; i< word.length();i++ ){
            System.out.println(word.charAt(i));
        }*/
        String sentence = inp.nextLine();
        String  javaCount =" ";
       String  pythonCount = "";
        for (int i=0; i < sentence.length();i++){
            if (sentence.contains("java")){
            javaCount="java";
            }else if (sentence.contains("phython")){

            }
        }
        System.out.println(javaCount=pythonCount);
    }
}
