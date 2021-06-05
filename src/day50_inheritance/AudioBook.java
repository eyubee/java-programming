package day50_inheritance;

public class AudioBook extends Book {
   int length;
   String narrator;
   public void listen(){
       System.out.println("i am listing to "+title+"and it is narrated by "+narrator);
       System.out.println("the first chapter was "+ length);
   }
}
