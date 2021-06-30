package day57_abstraction_polymorphism.abstract_class_vs_interface;

public class Runner {
    public static void main(String[] args) {
     /**  AbstractA absA= new AbstractA();   we can't create object
        InterfaceA intA= new InterfaceA();*/
     InterfaceA.staticMethodE("wooden spoon");
    // ConcreteA.staticMethodE("hello"); staticMethodE only works with interface class only
    }

}
