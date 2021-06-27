package replit.creditcard_inhertance;

public class Discover extends CreditCard{

    public class  CreditCard {
        double  apr = 11.99;
        boolean cashback = true;
    }


@Override
    public  void useCard(){
        super.useCard();
        System.out.println("Using Discover card");
    }

    @Override
    public void payBalance() {
        double balance=0;
        super.payBalance();
        System.out.println("Paying $"+ balance+"from"+super.balance);
    }
    //@Override
//    public void payBalance(double balance){
//        super.payBalance();
//
//    }

}
