package replit;
import java.util.Scanner;

public class weekday_switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
        int day = scan.nextInt();
    switch (day){
        case 1:
            day=1;
            System.out.println("Monday");
            break;
        case 2:
            day=2;
            System.out.println("Tuesday");
            break;
        case 3:
            day=3;
            System.out.println("Wednesday");
            break;
        case 4:
            day=4;
            System.out.println("thursday");
            break;
        case 5:
            day=5;
            System.out.println("Friday");
            break;
        case 6:
            day=6;
            System.out.println("Saturday");
            break;
        case 7:
            day=7;
            System.out.println("Sunday");
            break;
        default:
            System.out.println("Not a valid day");
    }
    }
}
