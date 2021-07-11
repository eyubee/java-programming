package day60_exceptions;

public class MultiCatchBlock {
    public static void main(String[] args) {
        String word= "java";
        //String word= null;
        try{
            System.out.println("length = "+word.length());//NullPointerException when string is null
            System.out.println(word.substring(20));
        } catch (NullPointerException e){
            System.out.println("NullPointerException caught and handeled");

        }catch (StringIndexOutOfBoundsException e){
            System.out.println("index is out of bounds");
        } catch(Throwable e){
            System.out.println("all other exception. This is parent exception");
            System.out.println("Reason = "+e.getCause());
        }


    }

}
