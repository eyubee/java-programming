package day53_inhertiance.hidding;

public class Phone {
    String type= "Old school phone";

    public static void use(){
        System.out.println("Using the phone");
    }
    public void call(){
        use();
        System.out.println(type+" and making a phone call");
    }
}
