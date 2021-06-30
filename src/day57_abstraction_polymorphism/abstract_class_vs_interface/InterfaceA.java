package day57_abstraction_polymorphism.abstract_class_vs_interface;

public interface InterfaceA {
    /**interface automatically makes all variables final
     * interfaces can ONLY have public static final variables  */
    public static final String TYPE= "interface";
    double MAX_COUNT= 500;

    public abstract void absMethodD(int num);//pure abstraction
    /** starting from java 8, interface can have static and default methods */
    public static void staticMethodE(String str){
        System.out.println("staticMethodE is called with str - "+str);
    }
    public default void defaultMethodF(){
        System.out.println("defaultMethodF is called");
    }

}
