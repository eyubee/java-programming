package day24_loops;
import  java.util.*;
public class StartEnd {
    public static void main(String []aergs){
        Scanner scan = new Scanner (System.in);
        System.out.println("enter start and end");
        int start = scan.nextInt();
        int end = scan.nextInt();
        if (end < start){
            System.out.println("reverse numbering not supported");
        } //else if (!end < start) {
           // for (int i = start; i <= end; i++) {
               // System.out.println(i + " ");

          //  }
       // }
        //print all numbers from start till end separated by space  start =30 end =6
        for (int i = start; i<=end;i++ ){
            System.out.println(i+" ");

        }

    }
}
