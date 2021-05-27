package day38_methods;

public class MethodCallAnother {
    public static void main(String[] args) {
        end();
        continues();
        start();

    }
    public static void start(){
        System.out.println("start");
        continues();
    }
    public static void continues(){
        System.out.println("contine");
        end();
    }
    public static void end(){
        System.out.println("end");
    }
}
