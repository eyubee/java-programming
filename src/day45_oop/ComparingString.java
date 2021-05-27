package day45_oop;

public class ComparingString {
    public static void main(String[] args) {
        String word1="java";//in string pool
        String word2="java";//string in the string pool will be used
        String word3= new String("java");//obj created in heap outside the pool
        System.out.println(word1==word2);
        System.out.println(word1==word3);
        System.out.println(word1.equals(word2));
        System.out.println(word1.equals(word3));

    }
}
