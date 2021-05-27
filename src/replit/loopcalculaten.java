package replit;
import java.util.*;

public class loopcalculaten {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       /* int n = scan.nextInt();
        long result= 1L;
       for (int i=n; i>0;i--){
          result=result*i;


        }
        System.out.println(result);*/
        String str = scan.next();
        int count = 0 ;

        //WRITE YOUR CODE HERE
        int charLength= str.length();
        int maxChar=3;
        String found="";
        for (int i=0; i<= charLength; i++ ) {
            for (int j=i+1; j<=charLength; j++) {
                if (str.charAt(i) == str.charAt(j) ){
                   found.equals(j);
                for (int k = j + 1; k <= charLength; k++) {
                    if ((str.charAt(j) == str.charAt(k) )) {
                      found.equals(k);
                    }

                }
                }
            }

        }
        System.out.println(count);
    }
}
