package day19_class_vs_object_string;

public class CyberTek {
    public static void main(String[] args) {
        String word= "eyerus IS SLEEPY";
        System.out.println(word.toLowerCase( ));
        System.out.println(word.toUpperCase( ));
        System.out.println("JAVA".toLowerCase());//declaring and printing at the same time
        System.out.println("java".toUpperCase());//declaring and printing at the same time
        //changes word to all uppercase
        word= word.toUpperCase();
        System.out.println(word);
    }
}
