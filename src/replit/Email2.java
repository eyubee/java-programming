package replit;
import java.util.*;
public class Email2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String firstName = email.substring(0, 1).toUpperCase() + email.substring(1, email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_") + 1, email.indexOf("@"));
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
        String domain = email.substring(email.indexOf("@") + 1, email.indexOf("."));

        System.out.println("First name: " + firstName + "\nLast name: " + lastName + "\nDomain: " + domain);


    }

}