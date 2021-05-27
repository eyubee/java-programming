package replit;
import java.util.Scanner;

public class JavaPythonCou {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int sentenceLength = sentence.length();
        int chrCount = 4;
        int javaCoun = 0;
        int pythonCount = 0;
        for (int i = 0; i <= sentenceLength - chrCount; i++) {
            if (sentence.substring(i, i + chrCount).equals("java")) {
                javaCoun++;
            }
        }
        chrCount = 6;
            for (int i = 0; i <= sentenceLength - chrCount; i++) {
                if (sentence.substring(i, i + chrCount).equals("phython")) {
                    pythonCount++;
                }


            }

        System.out.println(javaCoun==pythonCount);
    }
}