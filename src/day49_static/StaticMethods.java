package day49_static;

public class StaticMethods {
    int num=10;
    static int count= 5;
    public static void displayMessage(String message){
        System.out.println("massage : "+ message);
        System.out.println("count = " + count);
       // System.out.println("num = " + num);//error since num doesn't have the key word static

    }
    public static void anotherStaticMethod(){
        System.out.println("another static method");
        displayMessage("wooden spoon");

    }
    public void instanceMethod(){
        System.out.println("instance Method");//in order to call on this method, object must be created
        System.out.println("non static num = "+num);
        System.out.println("static num count = "+count);
    }
}
