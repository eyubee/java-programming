package day07_aritmetic_operators_casting;

public class PrimitiveCasting {
    public static void main( String []args){
        int num1= 100;
        //byte num2= num1;  this will create error becuse byte is smaller than int
        byte num2=(byte) num1;
        //short num3 = num1; need to get casted before using
        short num3= (short)num1;
        long num4=num1;
        //byte num4=num3; need casting
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);


    }
}
