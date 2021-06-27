package extra_work;

public class HierachicalInheritance {
    String wald;
    public HierachicalInheritance account(){
        return new HierachicalInheritance();
    }

}
class  Checking extends HierachicalInheritance {
    public Saving account(){
      super.wald="dkjskdj";
        return new Saving();
    }
//    public void superB(){
//        account();
//    }
}
class Saving extends HierachicalInheritance {
    public Checking account(){
        return new Checking();
    }
}