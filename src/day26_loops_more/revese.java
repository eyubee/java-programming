package day26_loops_more;

public class revese {
    public static void main(String[] args) {
        //print reverse
        String word2="python";
        for (int j=0 ;j< word2.length();j++){
            System.out.println(word2.charAt(j)+"-"+j);
        }
    }
}
//or(int i = 0; i < word.length(); i++) {
//            System.out.println(i +"-"+word.charAt(i));