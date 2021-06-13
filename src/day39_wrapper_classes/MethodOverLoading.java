package day39_wrapper_classes;

public class MethodOverLoading {
    public static void main(String[] args) {
        MethodOverLoading.sum(1,5);
        System.out.println(MethodOverLoading.sum(1,5));

    }
    public static int sum (int a, int b){
        int result = a+b;
        return result;
    }
    public static double sum (double a, double b) {
        double result = a + b;
        return result;
    }
    public static int sum (int a, int b, int c) {
        int result = a + b + c;
        return result;
    }
    public static String sum (String a, String b) {
        String result = a + b;
        return result;
    }
}
