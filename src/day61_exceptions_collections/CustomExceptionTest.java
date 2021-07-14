package day61_exceptions_collections;

public class CustomExceptionTest {
    public static void main(String[] args) {
        int mints= 40;
        if(mints >50){
            throw new BreakTimeException("it's break time ");
        }
        System.out.println("lets continue class ");
       double blanace = 400;
       double iteamPrice= 500;
       if(iteamPrice> blanace){
           throw new InsufficientBalanceException("Transaction declined. Not enough funds");
       }
           System.out.println("transaction is successful");
    }
}
