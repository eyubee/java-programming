package day14_multi_branch_if_statements;
import java.util.Scanner;
public class DayActivityWithScanner {
    public static void main(String[]args){
        Scanner scan= new Scanner(System.in);
        System.out.println("What is the weather?");
        String weather = scan.next();
            if (weather.equals("sunny")){
                System.out.println("Go for a walk");
            }else if (weather.equals("rainy")){
                System.out.println("stay home and drink tea");
            }else if (weather.equals("snow")){
                System.out.println("Don't leave the hose ");
            }else if (weather.equals("windy")){
                System.out.println("Get ready to clean and stay home");
            }else{
                System.out.println("keep coding java");
            }

        }
    }


