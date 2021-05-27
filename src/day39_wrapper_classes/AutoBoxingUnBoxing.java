package day39_wrapper_classes;

public class AutoBoxingUnBoxing {
    public static void main(String[] args) {
/**auto- boxing from primitives to wrapping*/
int num1= 500;
Integer  num2= num1;
Integer num3= 500;//this is also auto boxing since 500 is int
        /**un- boxing from  wrapping to primitives */
        Double d1= new Double (100.5);
        double d2= d1;
        double d3= new Double(100);//this is also unboxing

    }
}
