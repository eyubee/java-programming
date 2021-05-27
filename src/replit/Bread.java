package replit;
import java.util.*;
public class Bread {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int strlength=str.length();
        if (str.startsWith("bread") && str.endsWith("bread")){
            str= str.substring(5,str.length()-5);
            System.out.println(str);}
            else if (str.equals("xxbreadyy")){
                System.out.println("nothing");
        }else if((str.startsWith("xxbread"))&& (str.endsWith("breadyy"))){
            str= str.substring(7,str.indexOf("breadyy"));
            System.out.println(str);
        }else {
            System.out.println("nothing");
        }
    }
}
