package replit;
import java.util.*;

public class email1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();


        if (email.contains("_")){
            String lasttName= ""+email.substring(email.indexOf("_")+1,email.indexOf("@"));
            String underScore= ""+email.substring(email.indexOf("_"),email.indexOf("_")+1);
            String fistName=""+ email.substring(0,email.indexOf("_"));
            String emailtype= ""+email.substring(email.indexOf("@"));


            System.out.println(lasttName+underScore+fistName+emailtype);

        } else  {
            System.out.println(email);
        }

    }
}
