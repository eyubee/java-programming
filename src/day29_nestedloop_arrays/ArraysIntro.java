package day29_nestedloop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
       // int []nums;   //[]...means array
        int[] num2= new int[3];//when you know how many #'s you will get
        num2[0]=5;
        num2[1]=10;
        num2[2]=7;///longes way to decrear array
        System.out.println("value at index 0= "+num2[0]);
        System.out.println("value at index 1= "+num2[1]);
        System.out.println("value at index 2= "+num2[2]);

        //we cN ALO USE INT VARIABLE TO SPECIFY INDEXT #
        int i= 0;
        System.out.println(num2[0]);//5
        //HOW TO FIND OUT THE  SIZW OF THE ARRAY
        System.out.println(num2.length);
        //store length of array into len variable
        int len= num2.length;
        //change /reassign values in array
        num2[0]=200;
        num2[1]=100;
        num2[2]=60;


    }
}
