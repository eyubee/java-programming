package replit;
import java.util.*;
public class array_quiz {
    public static void main(String[] args) {
        char []array={'d','c','b','a'};
        Arrays.sort(array);
        for (char each :array ){
            System.out.println(each );
            if (each=='d'){
                continue;
            }
        }
 int n=0; String [ ] days={"sun","mon","wed","sat"};
 for (int i=0; i<days.length; i++){
     switch (days[i]){
         case "sat":
         case "sun":
             n-=1;
             break;
         case "mon":
             n++;
         case "wed":
             n+=2;
     }
 }
        System.out.println(n);
 int []num1= new int [3];
 int []num2= {1,2,3,4};
 num1=num2;
 for (int i= 0; i< num1.length; i++){
     System.out.println(num1[i]);
 }
    }
}
