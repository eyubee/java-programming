package day36_custom_methods_void;

public class Calculator {
    public static void main (String  [] args){

        System.out.println(add(155,200));
        System.out.println(minus(200,400));
        System.out.println(muiltiply(4,800));
        System.out.println(devision(6,9));

    }
    public static double add (double num1, double num2){
        double sum =num1+num2;
        return sum;
    }
    public static double minus (double num1, double num2) {
        double minus = num1 - num2;
        return minus;
    }
    public static double muiltiply (double num1, double num2) {
        double muilt = num1 * num2;
        return muilt;
    }
    public static double devision (double num1, double num2) {
        double devid = num1 / num2;
        return devid;
    }
}
