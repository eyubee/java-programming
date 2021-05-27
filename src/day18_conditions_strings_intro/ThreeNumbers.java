package day18_conditions_strings_intro;

public class ThreeNumbers {
    public static void main(String[] args) {
        int num1=1000;
        int num2=1000;
        int num3=400;
        if (num1 >= num2 && num1>=num3)
        {
            System.out.println(num1+ " is largest value");
        }else if (num2 >=num1 && num2>= num3)
        {
            System.out.println(num2+" is largest value");
        } else{
            System.out.println(num3+" is largest value");
        }
    }
}
