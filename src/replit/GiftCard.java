package replit;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enetr what you want to buy");
        int giftCard = 100;
        int shopedAmount =0;
        int balanceLeft = giftCard-shopedAmount;
        int BlanketPrice = 60;
        String Blanket = scan.next();
        int ChargerPrice = 25;
        int HatPrice = 25;
        int HeadphonesPrice = 30;
        int LaptopPrice = 200;
        int PantsPrice = 50;
        int PillowPrice = 40;
        int SmartphonePrice = 1000;
        int SocksPrice = 5;
        int USBCablePrice = 10;
        if (Blanket.equals("Blanket") || Blanket.equals("blanket") ) {
            balanceLeft = giftCard -BlanketPrice;
            System.out.println("Thank you for your purchase! \nYour current balance is: " + balanceLeft + "$");}
         else if (Blanket.equals("Charger") || Blanket.equals("charger")) {
                balanceLeft = (giftCard - balanceLeft)- ChargerPrice;
                System.out.println("Thank you for your purchase! \nYour current balance is: " + balanceLeft + "$");
            } else if (Blanket.equals("Hat") || Blanket.equals("hat")) {
                balanceLeft =(giftCard - balanceLeft)- HatPrice;
                System.out.println("Thank you for your purchase! \nYour current balance is: " + balanceLeft + "$");
            } else if (Blanket.equals("Headphones") || Blanket.equals("headphones")) {
                balanceLeft =(giftCard - balanceLeft)- HeadphonesPrice;
                System.out.println("Thank you for your purchase! \nYour current balance is: " + balanceLeft + "$");
            } else if (Blanket.equals("Laptop") || Blanket.equals("laptop")) {
            System.out.println("Sorry, not enough funds on your gift card!");
            } else if (Blanket.equals("Pants") || Blanket.equals("pants")) {
                balanceLeft = giftCard - PantsPrice;
                System.out.println("Thank you for your purchase! \nYour current balance is: " + balanceLeft + "$");
            } else if (Blanket.equals("Pilllow") || Blanket.equals("pillow")) {
                balanceLeft = giftCard - PillowPrice;
                System.out.println("Thank you for your purchase! \nYour current balance is: " + balanceLeft + "$");
            }else if  (Blanket.equals("Smartphones") || Blanket.equals("smartphones")) {
            System.out.println("Sorry, not enough funds on your gift card!");
         }else if (Blanket.equals("Socks") || Blanket.equals("socks")) {
            balanceLeft = giftCard - SocksPrice;
            System.out.println("Thank you for your purchase! \nYour current balance is: " + balanceLeft + "$");
         }else if  (Blanket.equals("USBCable") || Blanket.equals("usbcable")) {
            balanceLeft = giftCard - USBCablePrice;
            System.out.println("Thank you for your purchase! \nYour current balance is: " + balanceLeft + "$");
         }else {
            System.out.println("Invalid item!");
        }

    }
}