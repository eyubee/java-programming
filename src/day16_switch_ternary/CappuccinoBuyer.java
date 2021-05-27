package day16_switch_ternary;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size = "tall";
        double price = 3.69;
        int calories = 90;
        size = "tall";
        switch (size) {
            case "tall":
                price= 3.69;
                calories = 90;
                System.out.println("Grande Cappuccino please " + "\nprice: " + price + "\ncalories " + calories);
                break;
            case "grade":
                price= 3.99;
                calories = 120;
                System.out.println("grande Cappuccino please " + "\nprice: " + price + "\ncalories " + calories);
                break;
            case "Venti":
                price= 4.29;
                calories = 150;
                System.out.println("Venti Cappuccino please " + "\nprice: " + price + "\ncalories " + calories);
                break;
            default:
                System.out.println("We don't have that size");
                break;}
                System.out.println("Total Price: $" + price + "\nYou will consume " + calories + " cal of energy");



    }
}
