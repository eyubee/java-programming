package day09_scanner_practice;
import java.util.Scanner;

public class tepm_Converter {
    public static void main(String[]args){
        Scanner scam = new Scanner(System.in);
        System.out.println("what is the temp in celsius");
        int  fahreneheit= scam.nextInt();
        int celsius = (fahreneheit-32)*5/9;
        System.out.println("Temprature in celsius is "+ celsius);


                //=c=f-32*5/9
    }
}
