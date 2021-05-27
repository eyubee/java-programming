package day28_loops;
/** give a string retrieve and print only unique character */

public class FindUniqueChars {
    public static void main(String[] args) {
        String word= "javva";
        String uniqe= "";
        for (int i=0; i<  word.length(); i++){
            if (!uniqe.contains(word.charAt(i)+""))
                uniqe += word.charAt(i);
        }
        System.out.println(uniqe);
    }
}
