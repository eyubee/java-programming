package replit.creditcard_inhertance;

public class CapitalOne extends CreditCard{
    public class CreditCard{
        double  apr = 14.35;
        boolean cashback = false;
    }
@Override
    public  void useCard(){

        System.out.println("Using Capital One card");

    }
    @Override
    public void payBalance (){
       System.out.println("Paying $"+balance+ "from "+super.balance);

    }
}
