package day29_nestedloop_arrays;

public class CountCharsNestedLoop {
    public static void main(String[] args) {
        String word= "java";
        for (int outer= 0; outer<word.length();outer++){
            char outrChar= word.charAt(outer);
            int count= 0;
            for (int inner=0; inner<word.length(); inner++){
                char innetChar= word.charAt(inner);
                if (outrChar==innetChar)
                    count++;

            }
            System.out.println(outrChar+" ="+count);
        }
    }
}
