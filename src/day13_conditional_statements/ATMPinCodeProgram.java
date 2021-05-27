package day13_conditional_statements;
import java.util.Scanner;
public class ATMPinCodeProgram {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("*****WELCOME TO TD BANK ATM**** \n enter pin");
        int secretPin= scan.nextInt();
        int inputPincode= scan.nextInt();
       if(secretPin==inputPincode){
           System.out.println("welcome to your account");
           System.out.println("what would you like to do withdram, check balance, or depost ");}
       else{
           System.out.println("incorrect pin! please try again " );
       }

    }
}
