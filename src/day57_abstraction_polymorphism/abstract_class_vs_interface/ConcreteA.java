package day57_abstraction_polymorphism.abstract_class_vs_interface;

public class ConcreteA extends  AbstractA implements  InterfaceA, InterfaceB{
    /**class can extend to one class and implement more than one class*/
    @Override
    public void absMethodA(){
        System.out.println("abstract implementation is called");
    }
    @Override
    public void methodB(){
        System.out.println("methodB overriden version is called ");
    }
//    @Override
//    public static void staticMethodC(){
//      can't override since the method is static methods can only hide data
//    }
    public static void staticMethodC(){
        System.out.println("staticMethodC hidden version is called ");
    }

    @Override
    public void absMethodD(int num) {

    }
}
