package replit;
import java.util.Scanner;
public class VehicleRecall {
    public static void main(String[] args) {
        //DO NOT CHANGE
        int propertyPrice = 0;
        int numberOfBedrooms = 00;
        int garageSpots = 00;
        float metroAccessibility, schoolScore, highwayAccessibility;
        boolean backyard, smoking, garage;
        String houseType = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("*****************************************");
        System.out.println("* Welcome to the RealEstate calculator! *");
        System.out.println("*****************************************");
        //WRITE YOUR CODE HERE
        int totalPrice = 0;
        System.out.print("Enter your property type:");
        if (houseType.equals("Condo")) {
            propertyPrice = 50000;
        } else if (houseType.equals("Townhouse")) {
            propertyPrice = 75000;
        } else {
            propertyPrice = 95000;
        }
        System.out.println("How many bedrooms do you have?");
        if (numberOfBedrooms == 1) {
            totalPrice = propertyPrice + 30000;
            String in = scan.next();
            boolean drink = true;
            boolean side = true;
            double mealPrice = 10.0;
            double price = 0.0;
            double price2 = 0.0;
            if (in.equals("burger") || in.equals("chicken")) {
                System.out.println(mealPrice);
            } else if (drink = true) {
                price = 2.0;
                System.out.println(price);
            } else if (side = true) {
                price2 = 3.5;
                System.out.println(price2);
            }
        }
    }
}

