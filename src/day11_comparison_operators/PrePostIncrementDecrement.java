package day11_comparison_operators;

import java.awt.*;

public class PrePostIncrementDecrement {
    public static void main(String[]args){
        int num1=4;
        int num2=++num1;//pre-inceament
        //++num1 means increase num1 and then assign num2 as num1
        System.out.println(num1);
        System.out.println(num2);
        //post-inceament

        int num3=4;
        int num4=num3++;//num4=num3; then num3++;
        System.out.println(num3);
        System.out.println(num4);
        int apples =5;
        int basket =++apples;
        System.out.println( "apples = "+apples);
        System.out.println("in the basket= "+basket);

        int kiwi = 15;
        int basket2= kiwi++;
        System.out.println("Kiwi = "+kiwi);
        System.out.println("kiwi basket = "+basket2);//in this case what it si doing is assigning first so the second
        //value will be the orginal value then adding 1 to value 1 only

        int a =50;
        int b =22;
        int c= a++ + ++b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        int d =50;
        int e =22;
        int f= d++ + ++e ;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);




    }
}
