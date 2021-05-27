package day24_loops;

public class FizzBuzz {
    public static void main(String[] args) {

        for (int num =1; num<=100; num++){
            if (num%3==0 && num% 5==00){
                System.out.println("FizzBuzz "+num);
            }else if (num%3==0){
                System.out.println("Fizz "+num);
            }else if (num%5==0){
                System.out.println("Buzz"+ num);
            }

        }


    }
}
