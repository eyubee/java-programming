package day18_conditions_strings_intro;

public class FizzBuzz {
    public static void main(String[] args) {
        //"Fizz" number is divisable by 3
        //buzz if # is divisable by 5
        //fizzbuzz # is divisable by 3 and 5
        //else print the # it self
        //always check the two #'s cambo first order does matter
        int num1= 30;
        if (num1 %  3== 0 && num1 % 5==0){
            System.out.println("Fizzbuzz");
        } else if (num1 % 3==0){
            System.out.println("Fizz");
        } else if (num1 % 5==0) {
            System.out.println("Buzz");
        } else {
            System.out.println(num1);
        }

    }
}
