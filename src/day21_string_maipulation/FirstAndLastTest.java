package day21_string_maipulation;

public class FirstAndLastTest {
    public static void main(String[] args) {
        String word1= "mom";
        char first = word1.charAt(0);
        char second = word1.charAt(2);
        if (first==second)
        {
            System.out.println("first and last latter match");
        }else {
            System.out.println("first and last latter don't match");
        }
        String anotherWord= "aziza";
        if (anotherWord.charAt(0)==anotherWord.charAt(4)){
            System.out.println("name part read the same ");
        }else{
            System.out.println("doesn't read the same ");
        }
        char firstLetter= anotherWord.charAt(0);
        char lastLatter= anotherWord.charAt(anotherWord.length() -1);
        System.out.println(firstLetter +"\n"+ lastLatter);
    }
}
