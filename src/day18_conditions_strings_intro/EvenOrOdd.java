package day18_conditions_strings_intro;

public class EvenOrOdd {
    public static void main(String []args){
        int num1 =2;
        //when a number is divisable by 2, then it is even if not it is odd
        if (num1%2==0){
            System.out.println(num1+" even");
        }else {
            System.out.println(num1+" odd");
        }
        int number =10;
        if (number % 2==0){
            System.out.println(number +" is even");
        }else {
            System.out.println(number+ " is odd");
        }

    }
}
