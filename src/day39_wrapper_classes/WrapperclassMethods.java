package day39_wrapper_classes;

public class WrapperclassMethods {
    public static void main(String[] args) {

        System.out.println(Integer.max(10,5));
        System.out.println(Integer.sum(20,50));
        System.out.println("MIN INT: "+Integer.MIN_VALUE);//the smallest value
        System.out.println("MAX INT: "+ Integer.MAX_VALUE);
        System.out.println(Double.max(232.4, 23));
        System.out.println(Double.compare(5,1));//compare returns 2 values -1, 1 or 0-when the same and 1 when the first number is bigger and -1 when the second number is larger
        System.out.println(Double.compare(1,1));
        System.out.println(Double.compare(0,1));
        /**the most used */
        System.out.println(Character.isDigit('8'));
        char letter= 'A';
        if (Character.isUpperCase(letter)){
            System.out.println("it is uppercase");
        }
        String word= "jaVa is FuN";
        for (int i=0; i<word.length();i++){
            if (Character.isUpperCase(word.charAt(i))){
                System.out.print(word.charAt(i));
            }
        }
    }
}
