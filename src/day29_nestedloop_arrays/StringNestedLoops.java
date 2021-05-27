package day29_nestedloop_arrays;

public class StringNestedLoops {
    public static void main(String[] args) {
        //find duplicated and count
        //find unique charaters( appearing only once)
        //print charater and number of occurence
        String word = "java";
        for (int i = 0; i < word.length(); i++) {
            //System.out.println(word.charAt(i));
            for (int j = 0; j <= i; j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }
//the first example backword

        for (int i = 0; i < word.length(); i++) {
            //System.out.println(word.charAt(i));
            for (int j = i; j < word.length(); j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }

    }
}