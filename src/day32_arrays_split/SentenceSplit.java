package day32_arrays_split;
import java.util.Arrays;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence= "jave is fun";
        String sentenceArray []= sentence.split(" ");
        //print array list
        System.out.println(Arrays.toString(sentenceArray));
        //to split each word sparatelly the long was
        System.out.println("1st word = "+sentenceArray[0]);
        System.out.println("2nd word = "+sentenceArray[1]);
        System.out.println("3rd word = "+sentenceArray[2]);
        //short way to print each word in array out
        for(String each :sentenceArray ){
            System.out.println(each);
        }     //index of array    0       1       2        3     4
        String googleResult = "About 1,810,000 results (0.68 second)";
        //print just the numbers
        String resultArray []= googleResult.split(" ");

        System.out.println("count= "+resultArray[1]);
        System.out.println("seconds = "+resultArray[3].replace("(",""));
        System.out.println("seconds= "+resultArray[3].substring(1));
    }
}
