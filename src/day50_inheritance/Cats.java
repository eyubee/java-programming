package day50_inheritance;

public class Cats extends Animal{
    public void jumps(){
        System.out.println("this animal " +name+"is able to jump");
    }
    @Override
    public void speak(){
        System.out.println("cat is saying meow...");
    }
}
