package replit;
import java.util.Scanner;
public class video_games_coupons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int coupons = scan.nextInt();
        int rewaredCandy= coupons/10;
        int reminderCoupons= coupons%10;
        int rewaredGumballs= reminderCoupons/3;
        if (coupons>=3){
           System.out.println("Output: Number of Candies: "+rewaredCandy);
           System.out.println("Output: Number of Gumballs: "+rewaredGumballs);
        }else{
            System.out.println("Not enough coupons");
        }

    }
}
