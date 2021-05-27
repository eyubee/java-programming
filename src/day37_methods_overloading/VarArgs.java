package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10,5);
        addNumbers(100,400,500);
        addNumbers();

    }
    public static void addNumbers(int...nums){
        /** there is no limit with ...*/
        //inside the method, it is used as regular array
        int sum=0;
        for (int n: nums){
            sum+=n;
        }
        System.out.println("sum = "+sum);
    }
}
