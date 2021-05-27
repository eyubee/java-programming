package day05_primitives_concatanation;

public class CellPhone {
    public static void main(String[]args)
    {
        String brand="Apple";
        int model=11;
        String color= "gold";
        double price=999.99;
        int storage=64;
        String strageGB= "GB";
        boolean hasCamera=true;
        System.out.print(brand);
        System.out.print(model);
        System.out.println(color);
        System.out.println(price);
        System.out.println(price);
        System.out.println(storage);
        System.out.println(strageGB);
        System.out.println(hasCamera);
        System.out.println(brand+price+storage+strageGB+hasCamera);

//concat examples the thing in "" will be the base the the brand will be attached to the brand is
        System.out.print("Brand is " +brand);
        System.out.println("Model is "+model);
        System.out.println("coloer is "+color);
        System.out.println("price is "+price);
        System.out.println("storage is "+storage+"GB");
        System.out.println("has camera? "+hasCamera);
    }
}
