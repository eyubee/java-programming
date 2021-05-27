package day08_cating_scaner;
import java.util.Scanner;
//saved automatically when installed java..those are classes that come with the program


public class ScabberIntro {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");//we are telling the program what to expect
        String firstNmae =scan.next();//this is where the name is suppose to go
        System.out.println("nice to meet you,"+ firstNmae);//this is where the code puts the message is put toghther

    }
}
