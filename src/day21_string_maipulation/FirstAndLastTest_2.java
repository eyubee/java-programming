package day21_string_maipulation;

public class FirstAndLastTest_2 {
    public static void main(String[] args) {
        String word= "java";
        System.out.println(word.indexOf("a"));
        String word2= "github";
        System.out.println(word2.indexOf("hub"));
        System.out.println(word2.indexOf("eyerus"));//-1 if the character isn't there
    }
}
