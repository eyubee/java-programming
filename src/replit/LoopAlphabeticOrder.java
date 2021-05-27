package replit;
import java.util.Scanner;

public class LoopAlphabeticOrder {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
     /**   char start = scan.next().charAt(0);
        char end = scan.next().charAt(0);
        while(start<=end){
            System.out.print(start);
            start++;


        }*/
int i =1;
int j= 1;
        int n = scan.nextInt();
        String triange="";
        for(int outer=0 ; outer <=n; outer++){
            triange += "*";
            System.out.println(triange);

        }
    }
}
