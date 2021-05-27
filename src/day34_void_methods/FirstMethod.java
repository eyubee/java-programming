package day34_void_methods;

public class FirstMethod {
    public static void main(String[] args) {
        displayMessage();//call the method
        for (int i=0; i<=100; i++){
            displayMessage();
        }

    }
    /** first custom reusable method */
    public static void displayMessage(){
        System.out.println("Hello great future");//this is just a method and will not run till it is called

    }

}
