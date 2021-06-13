package day53_inhertiance.hidding;

public class Parent {
    public String name="parent is Amde";
    public void introduce1(){
        System.out.println("hello i am "+name);
    }
}

class Child extends Parent{
        public String name= "child is eyerus";
        public void introduce2(){
            System.out.println("hello i am "+name);
        }
}
class Runner{
    public static void main(String[] args) {
        Parent parent= new Parent();
        parent.introduce1();
        Child child= new Child();
        child.introduce1();
        child.introduce2();
    }
}
