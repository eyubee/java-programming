package day21_string_maipulation;

public class StringCharAt {
    public static void main(String[] args) {
        String word ="java";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        System.out.println("word.length() = " + word.length());
        String company= "cybertek";
        System.out.println("first letter: "+company.charAt(0));
        char first = company.charAt(0);
        System.out.println(first);
        char second =company.charAt(1);
        char third =company.charAt(2);
        char fourth =company.charAt(3);
        char fifth =company.charAt(4);
        char sixth =company.charAt(5);
        char seventh =company.charAt(6);
        char eighths =company.charAt(7);
        System.out.println(first+" "+second+" "+third+" "+fourth+" "+fifth+" "+sixth+" "+seventh+" "
                +eighths);
        String withSpaces= first+" "+second+" "+third+" "+fourth+" "+fifth+" "+sixth+" "+seventh+" "
                +eighths;
        System.out.printf(withSpaces);
        String word1= "mom";
        char first1 = word1.charAt(0);
        char second2 = word1.charAt(1);
      if (first==second)
      {
          System.out.println("read same");
      }

    }

}
