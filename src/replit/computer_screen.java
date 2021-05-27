package replit;
import java.util.Scanner;
public class computer_screen {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Select screen size:");
        double size= scan.nextDouble();
        int  price= 0;
        System.out.println("Select CPU type:");
        String CPUType= "i3";
        System.out.println("Select RAM size:");
        int ramSize= scan.nextInt();
        System.out.println("Select storage type:");
        String storageType= "SSD";
        System.out.println("Enter screen resolution:");
        String screenResolution ="FULLHD";
        if (size== 13.3 && CPUType.equals("i3") ){
            price= 200;

        }






    }
}
