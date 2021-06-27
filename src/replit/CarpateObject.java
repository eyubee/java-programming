package replit;

public class CarpateObject {
    public static void main(String[] args) {
        Carpet carpet= new Carpet();
        System.out.println(carpet.totalPrice);
        Carpet carpet1= new Carpet(20.0, 20.0, 2.0,true);
        System.out.println(carpet1.totalPrice);
    }
}
