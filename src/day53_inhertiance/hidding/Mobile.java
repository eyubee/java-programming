package day53_inhertiance.hidding;

public class Mobile extends Phone{
    String type= "mobile phone";
    /** this is method hiding
     * we are hidding use() static method */
    String test=
    public static void use(){
        System.out.println("using mobile phone");

    }
    public void text(){
        use();
        System.out.println(type+" sending a text message");
    }
    @Override
    public void call(){
        use();
        System.out.println("and calling on mobile ");
    }

}
