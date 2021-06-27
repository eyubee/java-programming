package day55_abstraction.interface_demo;

public interface MyInterface {
    public abstract void learn();
}
interface  MyInterface2{

}
class MyClass implements MyInterface, MyInterface2{
    @Override
    public void learn(){
        System.out.println("learning in my java class");
    }

}
class Main{
    public static void main(String[] args) {
        //MyInterface myInterface= new MyInterface(); error becuase can't create  ojb out of interface
        MyClass myClass = new MyClass();

    }
}