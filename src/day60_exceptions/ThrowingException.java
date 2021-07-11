package day60_exceptions;

public class ThrowingException {
    public static void main(String[] args) {
        System.out.println("lets create exceptions");
       /** RuntimeException e= new RuntimeException();
        throw e;//created a new exception
        throw new RuntimeException();*/
       String userName= "";
       if(userName.isEmpty()){
           throw new RuntimeException("username cannot be empty");
       }
    }
}
