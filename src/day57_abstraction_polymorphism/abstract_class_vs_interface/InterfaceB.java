package day57_abstraction_polymorphism.abstract_class_vs_interface;

public interface InterfaceB extends InterfaceA, Serializable, Cloneable {
    /**interface can extend multiple other interfaces. interfaces support multi-inheritance
     * when it extends another interface, child interface isn't responsible to override any methods
     * conceret sub class will be responsible for overriding all abstract classes */
}
