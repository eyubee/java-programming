package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {
        String StrPrice= "23";
        int count=500;
        Integer StrInt= Integer.parseInt(StrPrice);
        System.out.println(StrInt>count);

        String Str= "23.9";
        Double StrDouble= Double.parseDouble(StrPrice);
        double num= 58.0;
        System.out.println(num>StrDouble);

        String sentence= "I wrote 857 lines of code";
        String [] sentenceArr= sentence.split(" ");
        int linesOfCode=Integer.parseInt(sentenceArr[2]);
        System.out.println(linesOfCode);

    }
}
