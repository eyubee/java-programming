package day60_exceptions;

public class StringIndexIssue {
    public static void main(String[] args) {
        try{
            String word= "java";
            System.out.println("word = " + word);
            System.out.println(word.charAt(10));//StringIndexOutOfBoundsException without try catch
        } catch (Exception e){
            System.out.println("world index is invalid and it was handeled ");
            System.out.println("Reason = "+ e.getMessage());
        }
        String word2= "selenium";
        try{
            System.out.println(word2.substring(0,5));
            System.out.println(word2.substring(0,15));//StringIndexOutOfBoundsException without try catch
        }
        catch (StringIndexOutOfBoundsException  e){
            System.out.println("type of exception "+ e.getClass().getSimpleName());
            System.out.println("reason = "+e.getMessage());
        }
        }
}
