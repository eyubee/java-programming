package replit.creditcard_inhertance;

public class Chase extends CreditCard {
    public class CreditCard{
        double  apr = 10.99;
        boolean cashback = true;
    }
@Override
    public  void useCard(){
        System.out.println("Using Chase card");
    }
@Override
    public void payBalance(){
        System.out.println("Paying $"+ balance+"from"+super.balance);
    }

}
