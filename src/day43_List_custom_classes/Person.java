package day43_List_custom_classes;

public class Person {
    String firstName;
    int age;

    //behaviour
        public void speak() {
            System.out.println("person is speaing");
    }
}
class people{//for running in main method only
    public static void main (String []args){
        //creating object of person class by using INSTATIATION
        Person person1= new Person();
        person1.firstName="Bob";
        person1.age=33;
        System.out.println(person1.firstName);
        System.out.println(person1.age);
        person1.speak();
        Person person2= new Person();
        person2.firstName="Mike";
        person2.age= 55;
        person2.speak();
    }
}
