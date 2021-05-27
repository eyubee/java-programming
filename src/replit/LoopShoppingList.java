package replit;
import java.util.Scanner;
public class LoopShoppingList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ShoppingList="";
        String item =" ";
        double  Price = 0;
        double TotalPrice =0 ;
        String answer="";
        int count= 1;

        do {
            System.out.println("Enter Item"+item+" and its price:");
            item = scan.next();
            Price = scan.nextDouble();
            TotalPrice += Price;
            ShoppingList += "Iteam" + count + ":" + item + ", Price: " + Price;
            System.out.println("Add one more item?");
            answer = scan.next();
            if (answer.equals("yes")) {
                ShoppingList += ", ";
            }
            count++;
        } while (answer.equals("yes")&& count<=10);
        System.out.println(ShoppingList);
        System.out.println("Total price: "+TotalPrice);
    }
}
