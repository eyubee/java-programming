package day35_methods_with_param;

import java.util.Scanner;

public class MethodsWithParameter {
    public static void main(String[] args) {
        displayValue(50);
          int count= 60;
          displayValue(count);
          geetByName("eyu");
    }
    public static void displayValue(int num){
        System.out.println("value is "+num);
    }
    public static void geetByName( String name){
        System.out.println("hello "+ name+", how are you");

    }
    public static void plus(){

        //your code here

        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number:");
        int  num1= scan.nextInt();
        System.out.println("enter second number:");
        int num2= scan.nextInt();
        int result= num1+num2;
        System.out.println("result: "+result);



    }
}
