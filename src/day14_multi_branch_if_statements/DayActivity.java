package day14_multi_branch_if_statements;
import java.util.Scanner;
public class DayActivity {
    public static void main(String[]args){
        String weather = "windy";
        if (weather.equals("sunny")){
            System.out.println("Go for a walk");
        }else if (weather.equals("rainy")){
            System.out.println("stay home and drink tea");
        }else if (weather.equals("snowy")){
            System.out.println("Don't leave the hose ");
        }else if (weather.equals("windy")){
            System.out.println("Get ready to clean and stay home");
        }else{
            System.out.println("keep coding java");
        }

    }
}
