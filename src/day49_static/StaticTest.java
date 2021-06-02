package day49_static;

public class StaticTest {
    public static void main(String[] args) {
        /** RULE #1 static method can be called using classname and indtance method needs an object to be called */
//        String test="bnvbv";
        StaticMethods.displayMessage("woodedn spoon");
        StaticMethods stm= new StaticMethods();
        stm.instanceMethod();
        /**static method can only access other static variables and methods ONLY*/


    }
}
