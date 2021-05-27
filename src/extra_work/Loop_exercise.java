package extra_work;
import java.util.Scanner;
public class Loop_exercise {
  /**Write a program that can calculate the sum of all the even numbers between 1 ~ 100*/
  public static void main(String[] args) {
      for(int i=0; i<=100;i++) {
          if (i % 2 == 0) {
              int sum = 0;
              sum += i;
              System.out.print(sum + " ");
          }
      }
          /**Write a program that can calculate the sum of all the odd numbers between 1 ~ 100*/
      System.out.println();
      for(int i=0; i<=100;i++) {
          if (i % 2 == 1) {
              int sum = 0;
              sum += i;
              System.out.print(sum + " ");
          }
      }
/** Write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5*/
      System.out.println();
      for(int i=0; i<=100;i++) {
          if (i % 2 == 1) {
              if (i%3 ==0 && i%5==0 ){
                  System.out.print(i + " ");
              }

          }

      }
      /**Write a program that can print all the EVEN numbers between 0 ~ 100 that can be divisible by 3 & 5*/
      System.out.println();
      for(int i=0; i<=100;i++) {
          if (i % 2 == 0) {
              if (i%3 ==0 && i%5==0 ){
                  System.out.print(i + " ");
              }

          }
      }
      /**• Write a program that will ask ‘upper’ or ‘lower’
       • If it is upper: print the alphabet in all uppercase letter from A to Z • If it is lower: print the alphabet in all uppercase letter from a to z*/
      Scanner scan= new Scanner (System.in);
      System.out.println("upper or lower");
      String answer= scan.next();
      if(answer.equals("upper") ) {
          for (char letters = 'A'; letters <= 'Z'; letters++) {
              System.out.print(letters + " ");
          }


      }else if (answer.equals("lower")){
              for (char letters='a';letters<='z';letters++){
                  System.out.print(letters+" ");
          }
      }
/**Challenge: Also ask if they want to show the alphabet in ascending or order descending
 - Ascending:A–Zora–z
 - Descending:Z–Aorz–a*/
      System.out.println("Ascending or Descending");
      String answer2= scan.next();

      if(answer2.equals("Descending") ) {
          for (char letters = 'Z'; letters >= 'A'; letters--) {
              System.out.print(letters + " ");
          }


      }else if (answer2.equals("Ascending")){
          for (char letters='a';letters<='z';letters++){
              System.out.print(letters+" ");
          }
      }
      System.out.println("enter 5 numbers");
      int MaxNum=500;
      int MinNum=100;
      int num1= scan.nextInt();
          for (int i=0; i<=5; i++){

              if(num1>MaxNum){
                  MaxNum=num1;
              }

          }


      for (int i=0; i<=5; i++){

          if(num1< MinNum){
              MinNum=num1;
          }

      }


      System.out.println(MaxNum);
      System.out.println(MinNum);

  }
}
