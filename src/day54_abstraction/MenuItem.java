package day54_abstraction;

public abstract class MenuItem {
    public abstract void prepare();
    public abstract  void serve();
}

class Salad extends MenuItem{
    @Override
    public void prepare (){
        System.out.println("chop veggies, add dressing");
    }
    @Override
    public void serve(){
        System.out.println("serve for lunch");
    }

}