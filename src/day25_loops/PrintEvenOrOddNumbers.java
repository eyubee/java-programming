package day25_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
        System.out.println("even numbers");
        for (int i = 1; i<=100 ; i++) {
            if (i %2 ==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("\nodd numbers");
        for (int j = 1; j <= 100; j++) {
            if (j % 2 > 0) {
                System.out.print (j +" ");
            }
        }
    }
}