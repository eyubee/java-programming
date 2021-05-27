package replit;
import java.util.Scanner;
public class burger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String in = s.next();

        //your code here
        boolean drink = s.nextBoolean();
        double mealPrice = 10.0;
        double price = 0.0;
        boolean side = s.nextBoolean();
        double price2 = 3.5;
        if (in.equals("burger")|| in.equals("chicken")){
            System.out.println(mealPrice);
        }else if (in.equals("soda")){
            System.out.println("2.0");
        }else if (in.equals("fries"))
        {
            System.out.println("3.5");
        }

    }
}