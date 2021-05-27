package officeHours_3_16;
import java.util.Scanner;
public class ExamplesIF {
    public static void main(String[] args) {
        int a= 10;  //a=8
        int b= a-- *2 - --a % 2 +a;
        //  (a *2)= 10 *2 =20
        //10 *2 -a which is 8 % 2+8
        //20-(8 % 2)+8
        //20 - 0 +8 =28

        //even and odd
        if (11 % 2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        Scanner scan=new Scanner(System.in);
        int hour =scan.nextInt();
        int minute =scan.nextInt();
        int  second =scan.nextInt();
        scan.nextLine();
        String amOrPm =scan.next();

        //DO NOT TOUCH BELOW LINES. TEACHER WILL SET VALUES
        Scanner sc = new Scanner(System.in);
        hour   = sc.nextInt();
        minute = sc.nextInt();
        second = sc.nextInt();
        amOrPm = sc.next();
        //#############################

        //2. WRITE YOUR CODE HERE:
        System.out.print(hour +":"+minute+":"+second+amOrPm);


    }
}
