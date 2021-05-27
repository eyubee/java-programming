package day24_loops;
import java.util.*;
public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        int secretPinCode= 1234;
        int enteredPinCode;
        do{
            System.out.println("Enter pin code");
           enteredPinCode= scan.nextInt();

        }while (secretPinCode !=enteredPinCode);{
            if (secretPinCode == enteredPinCode) {
                System.out.println("pin accepted");
            }

        }

        }


    }

