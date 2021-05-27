package day05_primitives_concatanation;

public class WatchInfo {
    public static void main(String[]args) {


        //brand, color,price,waterResistant,isSmart,gender, madeIn
        String brand = "Apple";
        String color = "black";
        double price = 300;
        boolean waterResistant = true;
        boolean isSmart = true;
        char gender = 'U';
        String madeIn= "china";
        System.out.println("watch brand: "+brand+"\ncolor: "+color+"\nHow much is it? "+price+"\nIs it water resistanat?"
                +waterResistant+"\nis it smart watch?  "+isSmart+"\ngender? "+gender+"\nwhere was it made?"+madeIn);

    }
}
