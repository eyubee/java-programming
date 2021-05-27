package day08_cating_scaner;

public class CastingExamples {
    public static void main (String[]args){
        //byte-short-int-long...small to large so casting is done automatically
        byte num1=100;
        short num2=num1;

        //large to small casting
        byte num3=100;
        short num4=(byte)num3;
        System.out.println(num4); //shortcut sout
        System.out.println("num4 = " + num4); //shortcut soutv
        char letter ='M';
        //each letter small or capital will have a number that will reprsent them when we do int
        int letternum='E';

        System.out.println(letter);
        System.out.println(letternum);
    }
}

