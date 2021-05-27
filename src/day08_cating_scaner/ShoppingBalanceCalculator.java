package day08_cating_scaner;

public class ShoppingBalanceCalculator {
    public static void main (String []args){
        double startingBalance= 345.55;
        double price1=20.88;
        double price2 =89.99;
        int price3=15;
        //calculate remaining balance if the staring balance is 345.55
        double remainingBalance= startingBalance-(price1+price2+price3);
        System.out.println(" remaining balance is: $"+remainingBalance);
        System.out.println("**`Hello world'**");
        System.out.println("Turing, Alan");

        //**`Hello world`**

//print remaining balance without deciamal
        int balanceWithNoCents=(int)remainingBalance;
        System.out.println("your remaining balance without cents: "+balanceWithNoCents);


    }
}
