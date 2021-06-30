package day57_abstraction_polymorphism.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class AnimalTests {
    public static void main(String[] args) {
        Animal animal1= new Animal();//not polymorphic...data type and object type are same
        animal1.makeNoise();
        /**polymorphism  way
         parent type        new child type */
        Animal animal2= new Dog();
        Animal animal3= new Cat();
        Animal animal4= new Horse();
        Animal cat= new Cat();
        animal2.makeNoise();
        animal3.makeNoise();
        cat.makeNoise();
        animal4.makeNoise();
        //polymorphic list of objects list data type is parent class
        //objects are any of child classes
        List  <Animal> listOfAmnials= new ArrayList<>();
        listOfAmnials.add(new Dog());
        listOfAmnials.add(new Dog());
        listOfAmnials.add(new Cat());
        listOfAmnials.add(new Horse());

        for(Animal each: listOfAmnials){
            each.makeNoise();

        }

    }
}
