package day32_arrays_split;
import java.util.Arrays;
public class SplitMethod {
    public static void main(String[] args) {
                        //0   1      2        3
        String words = "java:python:selenium:html";
        String [] wordsArray= words.split(":");
        System.out.print (Arrays.toString(wordsArray));

       /** System.out.println("length of array is "+wordsArray.length);
        for (String each : wordsArray){
            System.out.println(each);
        }
        String sentence= "today I am coding java arrays";
        String [] sentenceArray= sentence.split(" ");
        System.out.println(Arrays.toString(sentenceArray));
        System.out.println(sentenceArray.length);
        for (String each: sentenceArray){//to print each array by itself
            System.out.println(each);
        }*/

    }
}
