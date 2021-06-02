package day48_constructors_static.static_examples;

public class Calculater {
    public static void add(int num1, int num2){
        System.out.println( num1 + num1);
    }
    //instance/object method since it dosn't have the key word static
    public void multipy (int num1, int num2){
        System.out.println(num1*num2);
    }
}
