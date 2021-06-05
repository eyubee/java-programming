package day50_inheritance;

public class AnimalsObjects {
    public static void main(String[] args) {
        Cats cat= new Cats();
        cat.name= "ugly cat";
        cat.type= "cat";
        cat.jumps();
        cat.speak();
        Dog dog= new Dog();
        dog.name="buddy";
        dog.type= "dog";
        dog.speak();
        dog.run();
    }


}
